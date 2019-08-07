package cn.kzhou.spring.aop.dynamic.proxy.impl;

import cn.kzhou.spring.aop.dynamic.proxy.Flayable;
import cn.kzhou.spring.aop.dynamic.proxy.InvocationHandler;
import cn.kzhou.spring.aop.dynamic.proxy.util.JavaCompile;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * 代理类，代理类生成类
 */
public class TimeProxy {

    public static Object newProxyInstance(Class inf, InvocationHandler handler) throws Exception{
        //创建代理类
        TypeSpec.Builder typeSpecBuilder = TypeSpec.classBuilder("TimeProxy1")
                .addSuperinterface(inf);

        FieldSpec fieldSpec = FieldSpec.builder(InvocationHandler.class, "handler", Modifier.PRIVATE).build();
        typeSpecBuilder.addField(fieldSpec);

        //创建全局变量
        /* FieldSpec fieldSpec = FieldSpec.builder(Flayable.class, "flyable", Modifier.PRIVATE).build();
        typeSpecBuilder.addField(fieldSpec);*/

        //创建构造方法
        /*MethodSpec constructorMethodSpec = MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC)
                .addParameter(inf, "flyable")
                .addStatement("this.flyable = flyable")
                .build();
        typeSpecBuilder.addMethod(constructorMethodSpec);*/

        MethodSpec constructorMethodSpec = MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC)
                .addParameter(InvocationHandler.class, "handler")
                .addStatement("this.handler = handler")
                .build();

        typeSpecBuilder.addMethod(constructorMethodSpec);

        //创建接口中所有方法
        /*Method[] methods = inf.getDeclaredMethods();
        for (Method method : methods) {
            MethodSpec methodSpec = MethodSpec.methodBuilder(method.getName())
                    .addModifiers(Modifier.PUBLIC)
                    .addAnnotation(Override.class)
                    .returns(method.getReturnType())
                    .addStatement("long start = $T.currentTimeMillis()", System.class)
                    .addCode("\n")
                    .addStatement("this.flyable." + method.getName() + "()")
                    .addCode("\n")
                    .addStatement("long end = $T.currentTimeMillis()", System.class)
                    .addStatement("$T.out.println(\"Fly Time =\" + (end - start))", System.class)
                    .build();
            typeSpecBuilder.addMethod(methodSpec);
        }*/
        Method[] methods = inf.getDeclaredMethods();
        for (Method method : methods) {
            MethodSpec methodSpec = MethodSpec.methodBuilder(method.getName())
                    .addModifiers(Modifier.PUBLIC)
                    .addAnnotation(Override.class)
                    .returns(method.getReturnType())
                    .addCode("try {\n")
                    .addStatement("\t$T method = " + inf.getName() + ".class.getMethod(\"" + method.getName() + "\")", Method.class)
                    // 为了简单起见，这里参数直接写死为空
                    .addStatement("\tthis.handler.invoke(this, method, null)")
                    .addCode("} catch(Exception e) {\n")
                    .addCode("\te.printStackTrace();\n")
                    .addCode("}\n")
                    .build();
            typeSpecBuilder.addMethod(methodSpec);
        }
        //创建包
        JavaFile javaFile = JavaFile.builder("cn.kzhou.spring.aop.dynamic.proxy.impl", typeSpecBuilder.build()).build();
        //代理类的实例可以临时创建放在内存中，这边为了直观感受，先放在工程目录中
        String sourcePath = "D:\\Project\\intergration\\spring-aop\\src\\main\\java";
        javaFile.writeTo(new File(sourcePath));
        //编译生成的代理类
        JavaCompile.compile(new File("D:\\Project\\intergration\\spring-aop\\src\\main\\java\\cn\\kzhou\\spring\\aop\\dynamic\\proxy\\impl\\TimeProxy1.java"));

        /*URL[] urls = new URL[] {new URL("file:/" + sourcePath)};
        URLClassLoader classLoader = new URLClassLoader(urls);
        Class clazz = classLoader.loadClass("cn.kzhou.spring.aop.dynamic.proxy.impl.TimeProxy1");
        Constructor constructor = clazz.getConstructor(inf);
        Flayable flyable = (Flayable) constructor.newInstance(new BirdDy());
        flyable.fly();*/
        // 使用反射load到内存
        URL[] urls = new URL[] {new URL("file:" + sourcePath)};
        URLClassLoader classLoader = new URLClassLoader(urls);
        Class clazz = classLoader.loadClass("cn.kzhou.spring.aop.dynamic.proxy.impl.TimeProxy1");
        Constructor constructor = clazz.getConstructor(InvocationHandler.class);
        Object obj = constructor.newInstance(handler);

        return obj;
    }
}

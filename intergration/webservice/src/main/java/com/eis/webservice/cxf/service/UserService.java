package com.eis.webservice.cxf.service;

import com.eis.webservice.cxf.domain.User;

import javax.ws.rs.*;
import java.util.List;

public interface UserService {
    // URL = http://localhost:8080/rs_server/webservice/userService/user
    @POST
    @Path("/user")
    @Consumes({ "application/xml", "application/json" })
    public void saveUser(User user);

    // URL = http://localhost:8080/rs_server/webservice/userService/user?id=1
    @DELETE
    @Path("/user")
    @Consumes({ "application/xml" })
    public void delUser(@QueryParam("id") int id);

    // URL = http://localhost:8080/rs_server/webservice/userService/user
    @PUT
    @Path("/user")
    @Consumes({ "application/xml", "application/json" })
    public void updateUser(User user);

    // URL = http://localhost:8080/rs_server/webservice/userService/user
    @GET
    @Path("/user")
    @Produces({ "application/xml", "application/json" })
    public List<User> findAllUsers();

    // URL = http://localhost:8080/rs_server/webservice/userService/user/1
    @GET
    @Path("/user/{id}")
    @Consumes({ "application/xml" })
    @Produces({ "application/xml", "application/json" })
    public User findUserByID(@PathParam("id") int id);
}

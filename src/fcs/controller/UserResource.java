package fcs.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.research.ws.wadl.Application;

import fcs.bean.User;

@Path("/user")
public class UserResource {
	@POST
	@Path("signUp")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public String registerUser(User user){
		return "success";
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getUser(){
		return "shrikant";
	}
}

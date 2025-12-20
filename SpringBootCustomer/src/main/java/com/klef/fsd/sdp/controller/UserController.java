package com.klef.fsd.sdp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.fsd.sdp.model.UserModel;
import com.klef.fsd.sdp.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService service;
 @GetMapping("/")
 public String dmeo1() {
     return "Welcome to the project";
 }
 @PostMapping("adduser")
 public String addUser(@RequestBody UserModel user) {
    return service.addUser(user);
 }
 
 @PutMapping("updateuser")
 public String updateUser(@RequestBody UserModel user) {
    return service.updateUser(user);
 }
 
 @GetMapping("displayuser")
 public List<UserModel> displayalluser() {
     return service.displayAllUsers();
 }
 
 @GetMapping("displaybyid/{uid}")
 public UserModel displayuserbyid(@PathVariable int uid) {
     return service.displayByid(uid);
 }
 
 @DeleteMapping("deleteuser/{uid}")
 public String deleteuser(@PathVariable int uid) {
	 return service.deleteUser(uid);
 }
 
 
 
 
 
}

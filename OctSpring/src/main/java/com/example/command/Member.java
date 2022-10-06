package com.example.command;

import java.util.List;

import lombok.Data;

@Data
public class Member {

	private String name;
	private int age;
	private String address;
	private List<String> pet;
}

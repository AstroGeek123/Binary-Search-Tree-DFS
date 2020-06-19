package com.company;
import java.lang.Math;
import java.util.Arrays;

public class Node {

	Node left, right;
	int data;

	public Node(int data) {
		 this.data = data;
	}

	public void insert(int num) {
		if(num <= data) {
			if(left == null) {
				left = new Node(num);
			}
			else {
				left.insert(num);
			}
		}
		else {
			if(right == null) {
				right = new Node(num);
			}
			else {
				right.insert(num);
			}
		}
	}

	public void dfs() {
		if(left != null) {
			left.dfs();
		}
			System.out.println(data);
		if(right != null) {
			right.dfs();
		}
	}

	public static void main(String[] args) {
		Node newTree = new Node(0);
		int[] numArray =  new int[100000];
		for(int i = 0; i < 100000; i++) {
			numArray[i] = 1 + (int)(Math.random() * 1000000);
		}
		for(int i = 0; i < 100000; i++){
			newTree.insert(numArray[i]);
		}
		newTree.dfs();
	}
}

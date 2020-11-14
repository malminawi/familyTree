package com.das.example;

import java.util.Scanner;
public class FamilyMain {
	
	public static void main(String[] args) {
		 boolean yORn = true;
		 String as[]=null;
			Scanner s=new Scanner(System.in);
			  while (yORn) {
					System.out.println("Please choose the following options for proceed");
					System.out.println("Enter 1 for parents ");
					System.out.println("Enter 2 display ");
					System.out.println("Enter 6 to Exit ");
					
					int n=s.nextInt();
					System.out.println();
					switch(n)
					{
					case 1:
						System.out.println("enter the grand father and mother name");
						String gdfather=s.next();
						//System.out.println("enter the grandmother name ");
						String gdmother=s.next();
						System.out.println(gdfather+"--------------------------"+gdmother);
						// System.out.println("/\t\t|\t\t\\");
					//	 System.out.println("/\t\t|\t\t\\");
						 System.out.println("Please choose the following options for proceed");
							System.out.println("Enter 1 for children");
							System.out.println("Enter 6 to Exit ");
							
							int n1=s.nextInt();
							System.out.println();
							switch(n1)
							{
							case 1:
								/*
								System.out.println("How many children do u have");
								int nb=s.nextInt();
								String br1[]=new String[nb];
								 System.out.println("/\t\t|\t\t\\");
								 System.out.println("/\t\t|\t\t\\");
								for(int i=0;i<br1.length;i++)
								{
								//	System.out.println("Enter children  name"+i);
									
									 br1[i]=s.next();
									if(i==0)
									{
										
									}else 
									{
									System.out.println(br1[i-1]+"\t\t\t\t"+ br1[i]+"\t");
									}
								}*/
								 s=new Scanner(System.in);
								System.out.println("how many children do u have  ");
								 n=s.nextInt();
								 as=new String[n];
								for(int i=0;i<n;i++)
								{
									as[i]=s.next();
									//System.out.println("\t\t\t"+as[i]);
								}
								if(n==1)
								{
									System.out.println("/\t");
									System.out.println("/\t");
								}
								else if(n==2)
								{
								System.out.println("/\t\t\\");
								 System.out.println("/\t\t\\");
								}
								else if(n==3)
								{
									System.out.println("/\t\t|\t\t\\");
									System.out.println("/\t\t|\t\t\\");
								}
								else if(n==4)
								{
									System.out.println("/\t\t|\t\t\\\t\t----");
									System.out.println("/\t\t|\t\t\\\t\t----");
								}
								for(int j=0;j<n;j++)
								{
									System.out.print(as[j]+"\t\t");
								}
								System.out.println("\n");
								break;
								
							case 6:
								   yORn = false;
				                    break;
							}
							 System.out.println("Please choose the following options for proceed");
								System.out.println("Enter 2 for children");
								System.out.println("Enter 6 to Exit ");
								
								int n2=s.nextInt();
								System.out.println();
								switch(n2)
								{
								case 2:
									
								/*	System.out.println("How many children do u have next level or spouse");
									int nb2=s.nextInt();
									String br2[]=new String[nb2];
									for(int i=0;i<br2.length;i++)
									{
									//	System.out.println("Enter children  name"+i);
										br2[i]=s.next();
										if(i==0)
										{
											
										}else 
										{
										System.out.println(br2[i-1]+"\t\t\t"+ br2[i]+"\t");
										}
									}*/
									System.out.println("How many children do u have next level or spouse");
									 n=s.nextInt();
									 as=new String[n];
									for(int i=0;i<n;i++)
									{
										as[i]=s.next();
										//System.out.println("\t\t\t"+as[i]);
									}
									if(n==1)
									{
										System.out.println("/\t");
										System.out.println("/\t");
									}
									else if(n==2)
									{
									System.out.println("/\t\t\\");
									 System.out.println("/\t\t\\");
									}
									else if(n==3)
									{
										System.out.println("/\t\t|\t\t\\");
										System.out.println("/\t\t|\t\t\\");
									}
									else if(n==4)
									{
										System.out.println("/\t\t|\t\t\\\t\t----");
										System.out.println("/\t\t|\t\t\\\t\t----");
									}
									for(int j=0;j<n;j++)
									{
										System.out.print(as[j]+"\t\t");
									}
									System.out.println("\n");
								break;
							case 6:
								   yORn = false;
				                    break;
							}
					case 2:
						Family f=new Family();
						f.ALlInfo();
						break;
					case 6:
	                    yORn = false;
	                    break;
					
					
					}
				  
			  
	}

	}}

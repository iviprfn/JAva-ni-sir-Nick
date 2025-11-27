import java.util.Scanner;
class Projects
{
	public static void main(String[] args)
	{
		menu();
	}
	public static void menu()
	{
			Scanner in = new Scanner(System.in);
			int choice = 1;
			while(choice!=0)
				{
				System.out.print("choose 1-56 to run a problem\n");
				System.out.print("choose 0 to exit\n");
				choice = in.nextInt();
				switch(choice)
				{
					case 1:
						MyFunctions.problemNo1();

						break;
						
					case 2:
						MyFunctions.problemNo2();
						break;
					case 3:
					    MyFunctions.problemNo3(in);

						break;
					case 4:
						MyFunctions.problemNo4(in);
		
						break;
					case 5:
						MyFunctions.problemNo5(in);
						break;
					case 6:
						MyFunctions.problemNo6(in);
						break;
					case 7:
						MyFunctions.problemNo7(in);
						break;	
					case 8:
						MyFunctions.problemNo8(in);
						break;		
					case 9:
						MyFunctions.problemNo9(in);
						break;	
					case 10:
						MyFunctions.problemNo10(in);
						break;		
					case 11:
						MyFunctions.problemNo11(in);
						break;		
					case 12:
						MyFunctions.problemNo12(in);
						break;
					case 13:
						MyFunctions.problemNo13(in);
						break;
					case 14:
						MyFunctions.problemNo14(in);
						break;	
					case 15:
						MyFunctions.problemNo15(in);
						break;
					case 16:
						MyFunctions.problemNo16(in);
						break;
					case 17:
						MyFunctions.problemNo17(in);
						break;	
					case 18:
						MyFunctions.problemNo18(in);
						break;	
					case 19:
						MyFunctions.problemNo19(in);
						break;
					case 20:
						MyFunctions.problemNo20(in);
						break;	
					case 21:
						MyFunctions.problemNo21(in);
						break;
					case 22:
						MyFunctions.problemNo22(in);
						break;
					case 23:
						MyFunctions.problemNo23(in);
						break;
					case 24:
						MyFunctions.problemNo24(in);
						break;
					case 25:
						MyFunctions.problemNo25(in);
						break;
					case 26:
						MyFunctions.problemNo26(in);
						break;
					case 27:
						MyFunctions.problemNo27(in);
						break;
					case 28:
						MyFunctions.problemNo28(in);
						break;
					case 29:
						MyFunctions.problemNo29()
						;
						break;
					case 30:
						MyFunctions.problemNo30(in);
						break;	
					
					case 31:
						MyFunctions.problemNo31(in);
						break;	
					case 32:
						MyFunctions.problemNo32(in);
						break;	
					case 33:
						MyFunctions.problemNo33(in);
						break;	
					case 34:
						MyFunctions.problemNo34(in);
						break;	
					case 35:
						MyFunctions.problemNo35(in);
						break;	
					case 36:
						MyFunctions.problemNo36(in);
						break;	
					case 37:
						MyFunctions.problemNo37(in);
						break;
					case 38:
						MyFunctions.problemNo38(in);
						break;	
					case 39:
						MyFunctions.problemNo39(in);
						break;	
					case 40:
						MyFunctions.problemNo40(in);
						break;	
					case 41:
						MyFunctions.problemNo41(in);
						break;
					case 42:
						MyFunctions.problemNo42(in);
						break;	
					case 43:
						MyFunctions.problemNo43(in);
						break;
					case 44:
						MyFunctions.problemNo44(in);
						break;	
					case 45:
						MyFunctions.problemNo45(in);
						break;	
					
					case 46:
						MyFunctions.problemNo46(in);
						break;
					
						case 47:
						MyFunctions.problemNo47(in);
						break;
					case 48:
						MyFunctions.problemNo48(in);
						break;
					case 49:
						MyFunctions.problemNo49(in);
						break;
					case 50:
						MyFunctions.problemNo50(in);
						break;
					case 51:
						MyFunctions.problemNo51(in);
						break;
					case 52:
						MyFunctions.problemNo52(in);
						break;
					case 53:
						MyFunctions.problemNo53(in);
						break;
					case 54:
						MyFunctions.problemNo54(in);
						break;
					case 55:
						MyFunctions.problemNo55(in);
						break;											
					case 56:
						MyFunctions.problemNo56(in);
						break;
																																				
					case 0:
						System.out.println("Thank you for using my program");
						in.close();
						System.exit(0);
						break;
					default:
						System.out.println("not yet implemented");
						break;
				}
	  }
	}
}
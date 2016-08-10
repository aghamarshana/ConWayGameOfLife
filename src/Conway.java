import java.util.Scanner;
//I am creating a branch to check the branchinf in Git
public class Conway {
	
public static char[][] getUpdatedGrid(char[][] fabGrid){
        
        char[][] updatedGrid=new char[8][10];
        for(int i=0;i<8;i++)
            updatedGrid[i][0]='.';
        for(int i=0;i<10;i++)
            updatedGrid[0][i]='.';
        for(int i=0;i<8;i++)
            updatedGrid[i][9]='.';
        for(int i=0;i<10;i++)
            updatedGrid[7][i]='.';
        int nt;
        int nf;
        
        
        for(int i=1;i<=6;i++){
            
            for(int j=1;j<=8;j++)
            {
                nt=0;
                nf=0;
               
                   if(fabGrid[i-1][j-1]=='o')
                       nt++;
                   else
                       nf++;
                   if(fabGrid[i][j-1]=='o')
                       nt++;
                   else
                       nf++;
                   if(fabGrid[i+1][j-1]=='o')
                       nt++;
                   else
                       nf++;
                   if(fabGrid[i-1][j]=='o')
                       nt++;
                   else
                       nf++;
                   if(fabGrid[i-1][j+1]=='o')
                       nt++;
                   else
                       nf++;
                   if(fabGrid[i][j+1]=='o')
                       nt++;
                   else
                       nf++;
                   if(fabGrid[i+1][j]=='o')
                       nt++;
                   else
                       nf++;
                   if(fabGrid[i+1][j+1]=='o')
                       nt++;
                   else
                       nf++;
                   
                    if(fabGrid[i][j]=='.'){
                        
                        if(nt==3)
                            
                            updatedGrid[i][j]='o';
                        else
                            
                            updatedGrid[i][j]='.';
                                
                       
                    }
                    
                    else{
                        
                        if(nt==2||nt==3)
                            updatedGrid[i][j]='o';
                        else
                            updatedGrid[i][j]='.';
                    
                    }
          
            }
      
        }
        
        
        return updatedGrid;
       
    }
    
    public static char[][] getFab(){
        
        char[][] fabGrid=new char[8][10];
        
        // Creating 8*10 Grid 
        //adding a boundary of 'false' to the entire grid provided by the user
        //then user need to enter the values in remaining 6*8
        
        for(int i=0;i<8;i++)
            fabGrid[i][0]='.';
        for(int i=0;i<10;i++)
            fabGrid[0][i]='.';
        for(int i=0;i<8;i++)
            fabGrid[i][9]='.';
        for(int i=0;i<10;i++)
            fabGrid[7][i]='.';
        Scanner sc=new Scanner(System.in);
        char c;
        System.out.println("Please enter '.' for dead state and 'o' for the live");
        
        //Takinng input in the Fabricated Grid which is surrounded by set of false
        
        for(int i=1;i<=6;i++)
        {
            
            System.out.println("Please enter the each cell state for the level "+i+", press enter after the each cell state");
            for(int j=1;j<=8;j++)
            {
               c=sc.nextLine().charAt(0);
               switch(c)
               {
                   case '.':fabGrid[i][j]='.';break;
                   case 'o':fabGrid[i][j]='o';break;
                   default :System.out.println("Enter valid character");j--;
                   
                   
               
               }
               
                   
            
            }
        
        
        }
        
    

return fabGrid;

}
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Conway Game of Life.");
        System.out.println("'.' represent a dead state");
        System.out.println("'o' represent a live state");
        
        char[][] fabGrid=getFab();
        
        char[][] updatGrid=getUpdatedGrid(fabGrid);
        
        System.out.println("Initial State");
        for(int i=1;i<=6;i++)
        {
            
            System.out.println();
            for(int j=1;j<=8;j++)
            {
               
               
                    System.out.print(fabGrid[i][j]+"  ");
            
            }
        
        
        }
        
         System.out.println();
        
       
        
        System.out.println("Updated State");
        
        
        for(int i=1;i<=6;i++)
        {
            
            System.out.println();
            for(int j=1;j<=8;j++)
            {
               
               
                    System.out.print(updatGrid[i][j]+"  ");
            
            }
        
        
        }
        
        
      
		
		

	}

}

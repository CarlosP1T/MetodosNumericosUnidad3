
package metodos;

import java.lang.reflect.Array;

public class clsMetodos {
    
    double ArrayRes[][]= new double[JFDatos.numFilasMatriz][JFDatos.numColumnasMatriz];
    double ArrayFinal[]= new double[JFDatos.numFilasMatriz];
    double acum=0;
    double mult=0;
    public double[] multVect(double datos[][], double x[], double c[])
    {
   for (int fil = 0; fil < JFDatos.numFilasMatriz; fil++) {

            for (int col = 0; col < JFDatos.numColumnasMatriz; col++) {

               mult=(datos[fil][col]*x[col]);
               acum= acum+mult;
               
            }
            ArrayFinal[fil]=acum+ c[fil];
        //System.out.print( ArrayFinal[fil]);    
            
    acum=0;
   // System.out.println("");
    }
        return this.ArrayFinal;
    
    
    
    

    }
    
    public double[]  CalcularError(double datos[][])
    {
        double datas[]= new double[JFDatos.numIteraciones-1];
        double aux[];
        aux= new double [JFDatos.numFilasMatriz];
     for(int fil = 0; fil < JFDatos.numFilasMatriz; fil++)
        {
            for(int col = 0; col< JFDatos.numIteraciones; col++)
            {
               aux[col]= datos[fil][col+1]-datos[fil][col];
              
                for(int i = 0; i < aux.length - 1; i++)
        {
            for(int j = 0; j < aux.length - 1; j++)
            {
                if (aux[j] < aux[j + 1])
                {
                    double tmp = aux[j+1];
                    aux[j+1] = aux[j];
                    aux[j] = tmp;
                }
            }
         }
            }
            
    }   
     for (int i=0; i<datas.length;i++)
     {datas[i]=aux[aux.length-1];}
     
         return datas;
    
}
}

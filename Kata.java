public class Greed{
  public static int greedy(int[] dice){
    int [] numeros={0,0,0,0,0,0};
    for(int i=0; i<5;i++)
      numeros[dice[i]-1]++;
    int puntuacion=0;
    for(int i=0; i<numeros[0];i++)
          puntuacion+=(i==2)?800:100;
    if(numeros[1]>2)puntuacion+=200;
    if(numeros[2]>2)puntuacion+=300;
    if(numeros[3]>2)puntuacion+=400;
    for(int i=0; i<numeros[4];i++)
          puntuacion+=(i==2)?400:50;
    if(numeros[5]>2)puntuacion+=600;
    return puntuacion;
  }
}

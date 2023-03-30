import java.util.Scanner;
public class app5 {
public static void main(String[] args) {
Scanner e = new Scanner(System.in);
double n1,n2,m,ta,te,tr,mt;
ta=0;
te=0;
tr=0;
mt=0;
for(int i=0;i<=6;i++);
System.out.println("digite as duas notas");
n1= e.nextDouble();
n2= e.nextDouble();

m= n1+n2/2;
if (m>0 && m<=3) {
System.out.println("reprovado");
tr=tr+1;
}
if (m>=3 && m<7) {
System.out.println("exame");
te=te+1;
    }
if (m>=7 && m<=10) {
System.out.println("aprovado");
ta= ta+1;
}
mt= mt+m;
System.out.println("total de reprovados"+tr);
System.out.println("total de exames"+te);
System.out.println("total de aprovados"+ta);
System.out.println("media da turma"+mt);
}
}

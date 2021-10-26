class Tugas2 {
public static void main(String[] args) {
int n1 = 21;
int n2 = 53;
int n3 = 51;

if(n1 > 65) {
if (n2 > 60 || n3 < 75) {
System.out.println("A");
} else {
System.out.println("B");
}
}else {
if(n3 > 50 && n2 < 55 || n3 < 55 && n2 > 55) {
System.out.println("C");
} else {
System.out.println("D");
}
}
}
}
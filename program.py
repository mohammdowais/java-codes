for name in range(1,26):
    f = open(f"{name}.java","x")
    f.write(
        f"public class Main {{\n" + \
        f"  public static void main(String[] args) {{\n" +\
        f'    System.out.println("Hello World");\n'+\
        f"   }}"+\
        f"}}"
    )
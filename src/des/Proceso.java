
package des;

/**
 *
 * @author Sr. Alberto
 */
public class Proceso {
    
    Llaves valores = new Llaves();
    
    char [][]permutedChoice1 = new char[7][8]; 
    char [][]permutedChoice2 = new char[6][8]; 
    
    public void conversion(String clave){
        String valor = clave;
        int size = valor.length();
        while(size<16){
            valor = "0"+valor;
            size = valor.length();
        }
        int contador=0;
        String clavPros="";
        for(int i=0;i<size;i++){
            switch(valor.charAt(i)){
                    case '0':
                        clavPros = clavPros+"0000";
                        break;
                    case '1':
                        clavPros =clavPros+"0001";
                        break;
                    case '2':
                        clavPros =clavPros+"0010";
                        break;
                    case '3':
                        clavPros =clavPros+"0011";
                        break;
                    case '4':
                        clavPros = clavPros+"0100";
                        break;
                    case '5':
                        clavPros = clavPros+"0101";
                        break;
                    case '6':
                        clavPros = clavPros+"0110";
                        break;
                    case '7':
                        clavPros = clavPros+"0111";
                        break;
                    case '8':
                        clavPros = clavPros+"1000";
                        break;
                    case '9':
                        clavPros = clavPros+"1001";
                        break;
                    case 'a':
                        clavPros = clavPros+"1010";
                        break;
                    case 'b':
                        clavPros = clavPros+"1011";
                        break;
                    case 'c':
                        clavPros = clavPros+"1100";
                        break;
                    case 'd':
                        clavPros = clavPros+"1101";
                        break;
                    case 'e':
                        clavPros = clavPros+"1110";
                        break;
                    case 'f':
                        clavPros = clavPros+"1111";
                        break;                    
                    default:
                        break;
            }
            contador++;            
        }                
        valores.setClavPros(clavPros);        
    }    
    public void calcCyD(){
        String permC = valores.getClavPros();
        
        permutedChoice1[0][0] = permC.charAt(56);
        permutedChoice1[0][1] = permC.charAt(48);
        permutedChoice1[0][2] = permC.charAt(40);
        permutedChoice1[0][3] = permC.charAt(32);
        permutedChoice1[0][4] = permC.charAt(24);
        permutedChoice1[0][5] = permC.charAt(16);
        permutedChoice1[0][6] = permC.charAt(8);
        permutedChoice1[0][7] = permC.charAt(0);
        permutedChoice1[1][0] = permC.charAt(57);
        permutedChoice1[1][1] = permC.charAt(49);
        permutedChoice1[1][2] = permC.charAt(41);
        permutedChoice1[1][3] = permC.charAt(33);
        permutedChoice1[1][4] = permC.charAt(25);
        permutedChoice1[1][5] = permC.charAt(17);
        permutedChoice1[1][6] = permC.charAt(9);
        permutedChoice1[1][7] = permC.charAt(1);
        permutedChoice1[2][0] = permC.charAt(58);
        permutedChoice1[2][1] = permC.charAt(50);
        permutedChoice1[2][2] = permC.charAt(42);
        permutedChoice1[2][3] = permC.charAt(34);
        permutedChoice1[2][4] = permC.charAt(26);
        permutedChoice1[2][5] = permC.charAt(18);
        permutedChoice1[2][6] = permC.charAt(10);
        permutedChoice1[2][7] = permC.charAt(2);
        permutedChoice1[3][0] = permC.charAt(59);
        permutedChoice1[3][1] = permC.charAt(51);
        permutedChoice1[3][2] = permC.charAt(43);
        permutedChoice1[3][3] = permC.charAt(35);
        permutedChoice1[3][4] = permC.charAt(62);
        permutedChoice1[3][5] = permC.charAt(54);
        permutedChoice1[3][6] = permC.charAt(46);
        permutedChoice1[3][7] = permC.charAt(35);
        permutedChoice1[4][0] = permC.charAt(30);
        permutedChoice1[4][1] = permC.charAt(22);
        permutedChoice1[4][2] = permC.charAt(14);
        permutedChoice1[4][3] = permC.charAt(6);
        permutedChoice1[4][4] = permC.charAt(61);
        permutedChoice1[4][5] = permC.charAt(53);
        permutedChoice1[4][6] = permC.charAt(45);
        permutedChoice1[4][7] = permC.charAt(37);
        permutedChoice1[5][0] = permC.charAt(29);
        permutedChoice1[5][1] = permC.charAt(21);
        permutedChoice1[5][2] = permC.charAt(13);
        permutedChoice1[5][3] = permC.charAt(5);
        permutedChoice1[5][4] = permC.charAt(60);
        permutedChoice1[5][5] = permC.charAt(52);
        permutedChoice1[5][6] = permC.charAt(44);
        permutedChoice1[5][7] = permC.charAt(36);
        permutedChoice1[6][0] = permC.charAt(28);
        permutedChoice1[6][1] = permC.charAt(20);
        permutedChoice1[6][2] = permC.charAt(12);
        permutedChoice1[6][3] = permC.charAt(4);
        permutedChoice1[6][4] = permC.charAt(27);
        permutedChoice1[6][5] = permC.charAt(19);
        permutedChoice1[6][6] = permC.charAt(11);
        permutedChoice1[6][7] = permC.charAt(3);
       
        String clavesota="";
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                clavesota=clavesota +permutedChoice1[i][j];
            }
        }        
        String cE="";
        for (int i = 0; i < 28; i++) {
            cE = cE+clavesota.charAt(i);
        }
        String dE="";
        for (int i = 28; i < 56; i++) {
            dE = dE+clavesota.charAt(i);
        }
        valores.setC0(cE);
        valores.setD0(dE);
    } 
    public void otrasCyD(){
        String nuevaC="";
        String nuevaD="";
        for (int i = 0; i < 16; i++) {
            switch(i){
                case 0:
                    for (int j = 1; j < valores.getC0().length(); j++) {
                        nuevaC = nuevaC+valores.getC0().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC0().charAt(0);
                    for (int j = 1; j < valores.getD0().length(); j++) {
                        nuevaD = nuevaD+valores.getD0().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD0().charAt(0);
                    valores.setC1(nuevaC);
                    valores.setD1(nuevaD);                    
                    break;
                case 1:
                    for (int j = 1; j < valores.getC1().length(); j++) {
                        nuevaC = nuevaC+valores.getC1().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC1().charAt(0);
                    for (int j = 1; j < valores.getD1().length(); j++) {
                        nuevaD = nuevaD+valores.getD1().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD1().charAt(0);
                    valores.setC2(nuevaC);
                    valores.setD2(nuevaD);
                    break;
                case 2:
                    for (int j = 2; j < valores.getC2().length(); j++) {
                        nuevaC = nuevaC+valores.getC2().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC2().charAt(0);
                    nuevaC = nuevaC+valores.getC2().charAt(1);
                    for (int j = 2; j < valores.getD2().length(); j++) {
                        nuevaD = nuevaD+valores.getD2().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD2().charAt(0);
                    nuevaD = nuevaD+valores.getD2().charAt(1);
                    valores.setC3(nuevaC);
                    valores.setD3(nuevaD);                    
                    break;
                case 3:
                    for (int j = 2; j < valores.getC3().length(); j++) {
                        nuevaC = nuevaC+valores.getC3().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC3().charAt(0);
                    nuevaC = nuevaC+valores.getC3().charAt(1);
                    valores.setC4(nuevaC);
                    for (int j = 2; j < valores.getD3().length(); j++) {
                        nuevaD = nuevaD+valores.getD3().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD3().charAt(0);
                    nuevaD = nuevaD+valores.getD3().charAt(1);
                    
                    valores.setD4(nuevaD);  
                    break;
                case 4:
                    for (int j = 2; j < valores.getC4().length(); j++) {
                        nuevaC = nuevaC+valores.getC4().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC4().charAt(0);
                    nuevaC = nuevaC+valores.getC4().charAt(1);
                    for (int j = 2; j < valores.getD4().length(); j++) {
                        nuevaD = nuevaD+valores.getD4().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD4().charAt(0);
                    nuevaD = nuevaD+valores.getD4().charAt(1);
                    valores.setC5(nuevaC);
                    valores.setD5(nuevaD);  
                    break;
                case 5:
                    for (int j = 2; j < valores.getC5().length(); j++) {
                        nuevaC = nuevaC+valores.getC5().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC5().charAt(0);
                    nuevaC = nuevaC+valores.getC5().charAt(1);
                    for (int j = 2; j < valores.getD5().length(); j++) {
                        nuevaD = nuevaD+valores.getD5().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD5().charAt(0);
                    nuevaD = nuevaD+valores.getD5().charAt(1);
                    valores.setC6(nuevaC);
                    valores.setD6(nuevaD);  
                    break;
                case 6:
                    for (int j = 2; j < valores.getC6().length(); j++) {
                        nuevaC = nuevaC+valores.getC6().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC6().charAt(0);
                    nuevaC = nuevaC+valores.getC6().charAt(1);
                    for (int j = 2; j < valores.getD6().length(); j++) {
                        nuevaD = nuevaD+valores.getD6().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD6().charAt(0);
                    nuevaD = nuevaD+valores.getD6().charAt(1);
                    valores.setC7(nuevaC);
                    valores.setD7(nuevaD);  
                    break;
                case 7:
                    for (int j = 2; j < valores.getC7().length(); j++) {
                        nuevaC = nuevaC+valores.getC7().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC7().charAt(0);
                    nuevaC = nuevaC+valores.getC7().charAt(1);
                    for (int j = 2; j < valores.getD7().length(); j++) {
                        nuevaD = nuevaD+valores.getD7().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD7().charAt(0);
                    nuevaD = nuevaD+valores.getD7().charAt(1);
                    valores.setC8(nuevaC);
                    valores.setD8(nuevaD);  
                    break;
                case 8:
                    for (int j = 1; j < valores.getC8().length(); j++) {
                        nuevaC = nuevaC+valores.getC8().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC8().charAt(0);
                    for (int j = 1; j < valores.getD8().length(); j++) {
                        nuevaD = nuevaD+valores.getD8().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD8().charAt(0);
                    valores.setC9(nuevaC);
                    valores.setD9(nuevaD);     
                    break;
                case 9:
                    for (int j = 2; j < valores.getC9().length(); j++) {
                        nuevaC = nuevaC+valores.getC9().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC9().charAt(0);
                    nuevaC = nuevaC+valores.getC9().charAt(1);
                    for (int j = 2; j < valores.getD9().length(); j++) {
                        nuevaD = nuevaD+valores.getD9().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD9().charAt(0);
                    nuevaD = nuevaD+valores.getD9().charAt(1);
                    valores.setC10(nuevaC);
                    valores.setD10(nuevaD);  
                    break;
                case 10:
                    for (int j = 2; j < valores.getC10().length(); j++) {
                        nuevaC = nuevaC+valores.getC10().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC10().charAt(0);
                    nuevaC = nuevaC+valores.getC10().charAt(1);
                    for (int j = 2; j < valores.getD10().length(); j++) {
                        nuevaD = nuevaD+valores.getD10().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD10().charAt(0);
                    nuevaD = nuevaD+valores.getD10().charAt(1);
                    valores.setC11(nuevaC);
                    valores.setD11(nuevaD);  
                    break;
                case 11:
                    for (int j = 2; j < valores.getC11().length(); j++) {
                        nuevaC = nuevaC+valores.getC11().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC11().charAt(0);
                    nuevaC = nuevaC+valores.getC11().charAt(1);
                    for (int j = 2; j < valores.getD11().length(); j++) {
                        nuevaD = nuevaD+valores.getD11().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD11().charAt(0);
                    nuevaD = nuevaD+valores.getD11().charAt(1);
                    valores.setC12(nuevaC);
                    valores.setD12(nuevaD);  
                    break;
                case 12:
                    for (int j = 2; j < valores.getC12().length(); j++) {
                        nuevaC = nuevaC+valores.getC12().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC12().charAt(0);
                    nuevaC = nuevaC+valores.getC12().charAt(1);
                    for (int j = 2; j < valores.getD12().length(); j++) {
                        nuevaD = nuevaD+valores.getD12().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD12().charAt(0);
                    nuevaD = nuevaD+valores.getD12().charAt(1);
                    valores.setC13(nuevaC);
                    valores.setD13(nuevaD);  
                    break;
                case 13:
                    for (int j = 2; j < valores.getC13().length(); j++) {
                        nuevaC = nuevaC+valores.getC13().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC13().charAt(0);
                    nuevaC = nuevaC+valores.getC13().charAt(1);
                    for (int j = 2; j < valores.getD13().length(); j++) {
                        nuevaD = nuevaD+valores.getD13().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD13().charAt(0);
                    nuevaD = nuevaD+valores.getD13().charAt(1);
                    valores.setC14(nuevaC);
                    valores.setD14(nuevaD);  
                    break;
                case 14:
                    for (int j = 2; j < valores.getC14().length(); j++) {
                        nuevaC = nuevaC+valores.getC14().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC14().charAt(0);
                    nuevaC = nuevaC+valores.getC14().charAt(1);
                    for (int j = 2; j < valores.getD14().length(); j++) {
                        nuevaD = nuevaD+valores.getD14().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD14().charAt(0);
                    nuevaD = nuevaD+valores.getD14().charAt(1);
                    valores.setC15(nuevaC);
                    valores.setD15(nuevaD);     
                    break;
                case 15:
                    for (int j = 1; j < valores.getC15().length(); j++) {
                        nuevaC = nuevaC+valores.getC15().charAt(j);
                    }
                    nuevaC = nuevaC+valores.getC15().charAt(0);
                    for (int j = 1; j < valores.getD15().length(); j++) {
                        nuevaD = nuevaD+valores.getD15().charAt(j);
                    }
                    nuevaD = nuevaD+valores.getD15().charAt(0);
                    valores.setC16(nuevaC);
                    valores.setD16(nuevaD);                    
                    break;
            }
            nuevaC="";
            nuevaD="";
        }
    }
    public void cuentaK(int repeticion){
        int contador = repeticion;        
        String concatK;
        
        switch(contador){
            
            case 1:
                concatK = valores.getC1()+valores.getD1();
                valores.setK1(Klcula(concatK));
                
                break;
            case 2:
                concatK = valores.getC2()+valores.getD2();
                valores.setK2(Klcula(concatK));
                break;
            case 3:
                concatK = valores.getC3()+valores.getD3();
                valores.setK3(Klcula(concatK));
                break;
            case 4:
                concatK = valores.getC4()+valores.getD4();
                valores.setK4(Klcula(concatK));
                break;
            case 5:
                concatK = valores.getC5()+valores.getD5();
                valores.setK5(Klcula(concatK));
                break;
            case 6:
                concatK = valores.getC6()+valores.getD6();
                valores.setK6(Klcula(concatK));
                break;
            case 7:
                concatK = valores.getC7()+valores.getD7();
                valores.setK7(Klcula(concatK));
                break;
            case 8:
                concatK = valores.getC8()+valores.getD8();
                valores.setK8(Klcula(concatK));
                break;
            case 9:
                concatK = valores.getC9()+valores.getD9();
                valores.setK9(Klcula(concatK));
                break;
            case 10:
                concatK = valores.getC10()+valores.getD10();
                valores.setK10(Klcula(concatK));
                break;
            case 11:
                concatK = valores.getC11()+valores.getD11();
                valores.setK11(Klcula(concatK));
                break;
            case 12:
                concatK = valores.getC12()+valores.getD12();
                valores.setK12(Klcula(concatK));
                break;
            case 13:
                concatK = valores.getC13()+valores.getD13();
                valores.setK13(Klcula(concatK));
                break;
            case 14:
                concatK = valores.getC14()+valores.getD14();
                valores.setK14(Klcula(concatK));
                break;
            case 15:
                concatK = valores.getC15()+valores.getD15();
                valores.setK15(Klcula(concatK));
                break;
            case 16:
                concatK = valores.getC16()+valores.getD16();
                valores.setK16(Klcula(concatK));
                break;
        }
    }    
    public String Klcula(String cyd){
        String clave = cyd;
        permutedChoice2[0][0] =  clave.charAt(13);
        permutedChoice2[0][1] =  clave.charAt(16);
        permutedChoice2[0][2] =  clave.charAt(10);
        permutedChoice2[0][3] =  clave.charAt(23);
        permutedChoice2[0][4] =  clave.charAt(0);
        permutedChoice2[0][5] =  clave.charAt(4);
        permutedChoice2[0][6] =  clave.charAt(2);
        permutedChoice2[0][7] =  clave.charAt(27);
        permutedChoice2[1][0] =  clave.charAt(14);
        permutedChoice2[1][1] =  clave.charAt(5);
        permutedChoice2[1][2] =  clave.charAt(20);
        permutedChoice2[1][3] =  clave.charAt(9);
        permutedChoice2[1][4] =  clave.charAt(22);
        permutedChoice2[1][5] =  clave.charAt(18);
        permutedChoice2[1][6] =  clave.charAt(11);
        permutedChoice2[1][7] =  clave.charAt(3);
        permutedChoice2[2][0] =  clave.charAt(25);
        permutedChoice2[2][1] =  clave.charAt(7);
        permutedChoice2[2][2] =  clave.charAt(15);
        permutedChoice2[2][3] =  clave.charAt(6);
        permutedChoice2[2][4] =  clave.charAt(26);
        permutedChoice2[2][5] =  clave.charAt(19);
        permutedChoice2[2][6] =  clave.charAt(12);
        permutedChoice2[2][7] =  clave.charAt(1);
        permutedChoice2[3][0] =  clave.charAt(40);
        permutedChoice2[3][1] =  clave.charAt(51);
        permutedChoice2[3][2] =  clave.charAt(30);
        permutedChoice2[3][3] =  clave.charAt(36);
        permutedChoice2[3][4] =  clave.charAt(46);
        permutedChoice2[3][5] =  clave.charAt(54);
        permutedChoice2[3][6] =  clave.charAt(29);
        permutedChoice2[3][7] =  clave.charAt(39);
        permutedChoice2[4][0] =  clave.charAt(50);
        permutedChoice2[4][1] =  clave.charAt(44);
        permutedChoice2[4][2] =  clave.charAt(32);
        permutedChoice2[4][3] =  clave.charAt(47);
        permutedChoice2[4][4] =  clave.charAt(43);
        permutedChoice2[4][5] =  clave.charAt(48);
        permutedChoice2[4][6] =  clave.charAt(38);
        permutedChoice2[4][7] =  clave.charAt(55);
        permutedChoice2[5][0] =  clave.charAt(33);
        permutedChoice2[5][1] =  clave.charAt(52);
        permutedChoice2[5][2] =  clave.charAt(45);
        permutedChoice2[5][3] =  clave.charAt(41);
        permutedChoice2[5][4] =  clave.charAt(49);
        permutedChoice2[5][5] =  clave.charAt(35);
        permutedChoice2[5][6] =  clave.charAt(28);
        permutedChoice2[5][7] =  clave.charAt(31);
        
        String kA="";
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                kA= kA + permutedChoice2[i][j];
            }
        }
        return kA;
    }
    public void consulta(){
        System.out.println("\nClave de 64bits: "+valores.getClavPros()+"\n"+ "");
        System.out.println("Valores de C y D \n");
        System.out.println("C0: "+valores.getC0());
        System.out.println("D0: "+valores.getD0());
        System.out.println("C1: "+valores.getC1());
        System.out.println("D1: "+valores.getD1());
        System.out.println("C2: "+valores.getC2());
        System.out.println("D2: "+valores.getD2());
        System.out.println("C3: "+valores.getC3());
        System.out.println("D3: "+valores.getD3());
        System.out.println("C4: "+valores.getC4());
        System.out.println("D4: "+valores.getD4());
        System.out.println("C5: "+valores.getC5());
        System.out.println("D5: "+valores.getD5());
        System.out.println("C6: "+valores.getC6());
        System.out.println("D6: "+valores.getD6());
        System.out.println("C7: "+valores.getC7());
        System.out.println("D7: "+valores.getD7());
        System.out.println("C8: "+valores.getC8());
        System.out.println("D8: "+valores.getD8());
        System.out.println("C9: "+valores.getC9());
        System.out.println("D9: "+valores.getD9());
        System.out.println("C10: "+valores.getC10());
        System.out.println("D10: "+valores.getD10());
        System.out.println("C11: "+valores.getC11());
        System.out.println("D11: "+valores.getD11());
        System.out.println("C12: "+valores.getC12());
        System.out.println("D12: "+valores.getD12());
        System.out.println("C13: "+valores.getC13());
        System.out.println("D13: "+valores.getD13());
        System.out.println("C14: "+valores.getC14());
        System.out.println("D14: "+valores.getD14());
        System.out.println("C15: "+valores.getC15());
        System.out.println("D15: "+valores.getD15());
        System.out.println("C16: "+valores.getC16());
        System.out.println("D16: "+valores.getD16());
        System.out.println("\nValores de K \n");
        System.out.println("K1: "+valores.getK1());
        System.out.println("K2: "+valores.getK2());
        System.out.println("K3: "+valores.getK3());
        System.out.println("K4: "+valores.getK4());
        System.out.println("K5: "+valores.getK5());
        System.out.println("K6: "+valores.getK6());
        System.out.println("K7: "+valores.getK7());
        System.out.println("K8: "+valores.getK8());
        System.out.println("K9: "+valores.getK9());
        System.out.println("K10: "+valores.getK10());
        System.out.println("K11: "+valores.getK11());
        System.out.println("K12: "+valores.getK12());
        System.out.println("K13: "+valores.getK13());
        System.out.println("K14: "+valores.getK14());
        System.out.println("K15: "+valores.getK15());
        System.out.println("K16: "+valores.getK16());
    }
}

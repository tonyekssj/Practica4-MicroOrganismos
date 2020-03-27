package org.programa;

public class MicroOrganismoTes {

    public MicroOrganismoTes(String nombre,int vida)
    {
        this._vida=vida;
        this._nombre = nombre;
        this._vidaTotal = _vidaTotal;

    }


    private int _vida;
    private String _nombre;
    private int _vidaTotal;

    public int Getvida(){return this._vida;}
    public String GetNombre(){return this._nombre;}

    public void IrLugar(String lugar)
    {
        switch(lugar)
        {
            case "higado":
                this._vida=this._vida>>1;
                System.out.println("El"+this._nombre+" Esta en "+lugar+" Con "+ this._vida+ "vidas");
                break;

            default:
                System.out.println("El"+this._nombre+" Esta en "+lugar+" Con "+ this._vida+ "vidas");
        }
    }

    public boolean EstaVivo(){return (this._vida>0);}
    public void setVida(int value) {this._vida=value;}
}

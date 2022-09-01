package Clases_Objetos;

/**
 * Representa a una clase Cuenta Bancaria, sus atributos y métodos
 * @author: Jonathan Fonseca Clavijo
 * https://github.com/Stone-1986/SofkaTalleres.git
 */
public class CuentaBancaria {

    /**
     * Representa los posibles atributos de una clase Cuenta Bancaria
     */
    private int accountNumber;
    private boolean activated;
    protected double balance;

    /**
     * Crea una instancia de la clase Persona sin especificar sus atributos
     */
    public CuentaBancaria(){}

    /**
     * Crea una instancia de la clase Cuenta Bancaria especificando sus atributos
     * @param accountNumber - numero de cuenta
     * @param activated - estado de cuenta
     */
    public CuentaBancaria(int accountNumber, boolean activated, double balance) {
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.balance = balance;
    }

    /**
     * Retorna el estado de un objeto cuenta bancaria
     * @return - retorna true si la cuenta bancaria esta activa o false si no lo esta
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Retorna el saldo disponible de un objeto cuenta bancaria
     * @return - saldo de la cuenta bancaria
     */
    public double geBalance() {
        return balance;
    }

    /**
     * Permite realizar un importe a un objeto cuenta bancaria
     * Se válida que el importe sea mayor que 0
     * @param amount - importe a depositar
     */
    public void addAmount(double amount){
        if (amount > 0 ) {
            balance += amount;
        }else{
            System.out.println("El importe debe ser mayor a cero");
        }
    }

    /**
     * Verifica si un importe es mayor o igual al saldo de un objeto cuenta bancaria
     * @param amount - importe a retirar
     * @return true si el saldo es mayor o igual, false si el saldo es menor
     */
    private boolean availableBalance(double amount){
        return balance >= amount;
    }

    /**
     * Realiza un retiro de dinero a un objeto cuanta bancaria
     * Válida si el saldo disponible es válido para un retiro
     */
    public void removeCash (double amount){
        if (availableBalance(amount)){
            balance -= amount;
        }else {
            System.out.println("No dispone de un saldo suficiente");
        }
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante dado
     * @return una cadena con el valor de los atributos de un objeto en un instante dado
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "accountNumber=" + accountNumber +
                ", activated=" + activated +
                ", balance=" + balance +
                '}';
    }
}


 class ExibirFormas {
    public static void main(String[] args) {
        desenharCaixa();
        desenharElipse();
        desenharSeta();
        desenharLosango();
    }

    public static void desenharCaixa() {
        System.out.println("*********");
        for (int i = 0; i < 6; i++) {
            System.out.println("*       *");
        }
        System.out.println("*********");
    }

    public static void desenharElipse() {
        System.out.println("  ***  ");
        System.out.println(" *   * ");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println(" *   * ");
        System.out.println("  ***  ");
    }

    public static void desenharSeta() {
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println("    *    ");
        System.out.println("    *    ");
    }

    public static void desenharLosango() {
        System.out.println("    *    ");
        System.out.println("   * *   ");
        System.out.println("  *   *  ");
        System.out.println(" *     * ");
        System.out.println("  *   *  ");
        System.out.println("   * *   ");
        System.out.println("    *    ");
    }
    

}
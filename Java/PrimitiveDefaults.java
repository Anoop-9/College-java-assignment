public class PrimitiveDefaults {
    public static void main(String[] args) {
        System.out.println("byte: Default value = " + (byte) 0 + ", Size = " + Byte.BYTES + " bytes");
        System.out.println("short: Default value = " + (short) 0 + ", Size = " + Short.BYTES + " bytes");
        System.out.println("int: Default value = " + 0 + ", Size = " + Integer.BYTES + " bytes");
        System.out.println("long: Default value = " + 0L + ", Size = " + Long.BYTES + " bytes");
        System.out.println("float: Default value = " + 0.0f + ", Size = " + Float.BYTES + " bytes");
        System.out.println("double: Default value = " + 0.0d + ", Size = " + Double.BYTES + " bytes");
        System.out.println("char: Default value = " + '\u0000' + ", Size = " + Character.BYTES + " bytes");
        System.out.println("boolean: Default value = false, Size = " + 1 + " bit");
    }
}

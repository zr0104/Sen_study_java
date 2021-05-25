package enum01;

/*void set(int index)
将指定索引处的位设置为 true。
void and(BitSet set)
对此目标位 set 和参数位 set 执行逻辑与操作。
void or(BitSet bitSet)
对此位 set 和位 set 参数执行逻辑或操作。
void xor(BitSet bitSet)
对此位 set 和位 set 参数执行逻辑异或操作。
*/
import java.util.BitSet;

public class BitSet01{
  public static void main(String[] args) {
	BitSet bits1 = new BitSet(16);
	BitSet bits2 = new BitSet(16);
	
	// set some bits
	for(int i=0; i<16; i++) {
		if((i%2) == 0) bits1.set(i);
		if((i%5) != 0) bits2.set(i);
	}
	System.out.println("Initial pattern in bits1：");
	System.out.println(bits1);
	System.out.println("\nInitial pattern in bits2：");
	System.out.println(bits2);
	
	// AND bits
	bits2.and(bits1);
	System.out.println("\nbits2 AND bits1：");
	System.out.println(bits2);
	
	// OR bits
	bits2.or(bits1);
	System.out.println("\nbits2 OR bits1：");
	System.out.println(bits2);
	
	// XOR bits
	bits2.xor(bits1);
	System.out.println("\nbits2 XOR bits1");
	System.out.println(bits2);
	
  }
}
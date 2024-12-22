import java.awt.Color;


/**
 * Demonstrates the morphing operationin combination with the greyscaled operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, a string representing the name of the PPM file
 * of a target image, and the number of morphing steps (an int). 
 * For example, to morph the cake into greyscaled ironman in 50 steps, use:
 * java Editor3 cake.ppm ironman.ppm 50.
 */
public class Editor4 {

	public static void main(String[] args) {
		String source = args[0];
		String target = args[1];
		int n = Integer.parseInt(args[2]);
		Color[][] sourceImage = Runigram.read(source);
		Color[][] targetImage = Runigram.read(target);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, Runigram.grayScaled(targetImage), n);
	}
}

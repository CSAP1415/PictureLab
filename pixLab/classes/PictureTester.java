/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
public static void testMirrorVerticalRightToLeft(){
 Picture caterpillar = new Picture("caterpillar.jpg");
 caterpillar.explore();
 caterpillar.mirrorVerticalRightToLeft();
 caterpillar.explore();
 }
 public static void testMirrorHorizontal(){
 Picture caterpillar = new Picture("caterpillar.jpg");
 caterpillar.explore();
 caterpillar.mirrorHorizontal();
 caterpillar.explore();
 }
}
public static void testMirrorHorizontalBotToTop(){
 Picture caterpillar = new Picture("caterpillar.jpg");
 caterpillar.explore();
 caterpillar.mirrorHorizontal();
 caterpillar.explore();
 }
 public static void testMirrorArms(){
 Picture snowman = new Picture("snowman.jpg");
 snowman.explore();
 snowman.mirrorHorizontal();
 snowman.explore();
 }
}
public static void testKeepOnlyBlue(){
 Picture beach=new Picture("beach.jpg");
 beach.explore();
 beach.keepOnlyBlue();
 beach.explore();
 }
 public static void testNegate(){
 Picture beach=new Picture("beach.jpg");
 beach.explore();
 beach.negate();
 beach.explore();
 }
 public static void testGrayScale(){
 Picture beach=new Picture("beach.jpg");
 beach.explore();
 beach.grayScale();
 beach.explore();
 }
 public static void testFixUnderWater(){
 Picture water=new Picture("water.jpg");
 water.explore();
 water.fixUnderWater();
 water.explore();
}
public static void testMirrorVerticalRightToLeft(){
Picture caterpillar = new Picture("caterpillar.jpg");
@@ -106,7 +136,31 @@ public static void testMirrorHorizontalBotToTop(){
public static void testMirrorArms(){
Picture snowman = new Picture("snowman.jpg");
snowman.explore();
snowman.mirrorArms();
}
 public static void testMirrorGull(){
 Picture seaGull = new Picture("seagull.jpg");
 seaGull.explore();
 seaGull.mirrorGull();
 seaGull.explore();
 }
 public static void testCopy(){
 Picture seaGull = new Picture("seagull.jpg");
 seaGull.explore();
 seaGull.copy(new Picture("snowman.jpg"),278,254,50,270,80,200);
 seaGull.explore();
 }
 public static void testMyCollage(){
 Picture beach=new Picture("beach.jpg");
 beach.explore();
 beach.myCollage();
 beach.explore();
 }
 public static void testEdgeDetection2(){
 Picture swan=new Picture("swan.jpg");
 swan.explore();
 swan.edgeDetection2(10);
 swan.explore();
 }
}

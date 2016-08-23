import static org.junit.Assert.assertEquals;
import org.junit.*;

public class DogTest{
  Dog dog;
  Bone bone;

  @Before
  public void before() {
    dog = new Dog("Archie", 10);
    bone = new Bone();
  }

  @Test
  public void hasName() {
    assertEquals("Archie", dog.getName());
  }

  @Test
  public void
  dogHasWeight() {
    assertEquals(10, dog.getWeight());
  }

  @Test 
  public void dogStartsWithNoBones() {
    assertEquals( 0, dog.boneCount());
  }

  @Test
  public void canChewBone() {
    dog.chew(bone);
    assertEquals( 1, dog.boneCount());
  }

  // @Test
  // public void bellyIsFull() {
  //   for(int i = 0; i < 3; i++){
  //     dog.chew(bone);
  //   }
  //   assertEquals(true, dog.bellyFull());
  // }

  // @Test
  // public void bellyIsNotFull() {
  //   for(int i = 0; i < 1; i++){
  //     dog.chew(bone);
  //   }
  //   assertEquals(false, dog.bellyFull());
  // }

  @Test 
  public void
  canBeSick() {
    dog.chew(bone);
    assertEquals(1, dog.boneCount());
    dog.sick();
    assertEquals(0, dog.boneCount());
  }

  @Test public void
  dogWeightChanges() {
    for(int i = 0; i < 2; i++){
      dog.chew(bone);
    }
    assertEquals(30, dog.getWeight());
  }


}
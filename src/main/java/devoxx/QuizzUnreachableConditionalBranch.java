package devoxx;

public class QuizzUnreachableConditionalBranch {

  public int ultimateBoringBusinessLogic(int antonio, int nicolas, int zouheir) {
    if (antonio > nicolas && nicolas == zouheir && zouheir > antonio) {
      return Integer.MAX_VALUE;
    }
    return -1;
  }
}

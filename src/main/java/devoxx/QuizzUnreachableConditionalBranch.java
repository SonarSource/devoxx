package devoxx;

public class QuizzUnreachableConditionalBranch {

  public int ultimateBoringBusinessLogic(int antonio, int nicolas, int zouheir,
      int arnaud) {
    if (antonio > nicolas && nicolas == zouheir && zouheir > arnaud
        && arnaud > antonio) {
      return Integer.MAX_VALUE;
    }
    return -1;
  }
}

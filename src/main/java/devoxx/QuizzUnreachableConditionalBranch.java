package devoxx;

public class QuizzUnreachableConditionalBranch {

  public int ultimateBoringBusinessLogic(int antonio, int nicolas, int zouheir, int arnaud) {
    if(antonio > nicolas) {
      return nicolas;
    } else if (nicolas == zouheir) {
      return nicolas * 2;
    } else if(zouheir < arnaud) {
      return arnaud;
    } else if(nicolas == arnaud) {
      if(arnaud < antonio) {
        return 0;
      }
      return zouheir + arnaud;
    }
    return -1;
  }
}

package sia.knights;
  
/** 勇敢的骑士，该骑士没有自行创建探险任务，而是在构造的时候把探险任务作为构造器参数传入
 * @author li_qiaoyun
 */
public class BraveKnight implements Knight {
  /** 没有和特定的quest实现发生耦合*/
  private Quest quest;

  public BraveKnight(Quest quest) {
    this.quest = quest;
  }

  @Override
  public void embarkOnQuest() {
    quest.embark();
  }

}

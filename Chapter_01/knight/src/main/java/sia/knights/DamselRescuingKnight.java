package sia.knights;

/**
 * 营救少女的骑士
 * @author li_qiaoyun
 */
public class DamselRescuingKnight implements Knight {
  /**自行创建了rescueDamsekQuest,使其耦合在了一起*/
  private RescueDamselQuest quest;

  public DamselRescuingKnight() {
    this.quest = new RescueDamselQuest();
  }

  @Override
  public void embarkOnQuest() {
    quest.embark();
  }

}

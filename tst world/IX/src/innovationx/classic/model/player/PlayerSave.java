package src.innovationx.classic.model.player;

import java.io.*;

public class PlayerSave implements Serializable {

    public String playerPass = "";
    public String playerName = "";
    public int absX = 0;
    public int absY = 0;
    public int heightLevel = 0;
    public int playerRights = 0;
    public int[] playerEquipment = new int[1];
    public int[] playerEquipmentN = new int[1];
    public int[] playerItems = new int[1];
    public int[] playerItemsN = new int[1];
    public int[] bankItems = new int[1];
    public int[] bankItemsN = new int[1];
    public int[] playerLevel = new int[1];
    public int[] playerXP = new int[1];
    public long[] friends = new long[1];
    public long[] ignores = new long[1];
    public int[] playerLook = new int[1];
    public int pHead = 0;
    public int pTorso = 0;
    public int pArms = 0;
    public int pHands = 0;
    public int pLegs = 0;
    public int pFeet = 0;
    public int pBeard = 0;
    public int clueRewardDelay = 0;
    public int FightArenaKills = 0;
    public int mageArenaKills = 0;
    public int dharokSummoned = 0;
    public int ahrimSummoned = 0;
    public int guthanSummoned = 0;
    public int karilSummoned = 0;
    public int toragSummoned = 0;
    public int veracSummoned = 0;
    public int hiddenBarrowBro = 0;
    public int poisonDelay = 0;
    public int specialAmount = 0;
    public int spellSet = 0;
    public int vengenceDelay = 0;
    public int muted = 0;
    public int pcPoints = 0;
    public int pkPoints = 0;
	public int zombiePoints = 0;
	public int clanWarsPoints = 0;
    public int skullTimer = 0;
    public int tzWave = 0;
    public int crystalBowShots = 0;
    public int ancQuest = 0;
    public int legendQuest = 0;
    public int mageZQuest = 0;
    public int slayerId = 0;
    public int slayerAmt = 0;
    public int runeMysteriesQuest = 0;
    public int mageArenaQuest = 0;
    public int lunarQuest = 0;
    public int knightWavesQuest = 0;
    public int skillId = 0;
    public int lostCityQuest = 0;
    public int forgeRing = 280;

    public PlayerSave(Player plr) {
        playerPass = plr.playerPass;
        playerName = plr.playerName;
        absX = plr.absX;
        absY = plr.absY;
        heightLevel = plr.heightLevel;
        playerRights = plr.playerRights;
        playerEquipment = plr.playerEquipment;
        playerEquipmentN = plr.playerEquipmentN;
        playerItems = plr.playerItems;
        playerItemsN = plr.playerItemsN;
        bankItems = plr.bankItems;
        bankItemsN = plr.bankItemsN;
        playerLevel = plr.playerLevel;
        playerXP = plr.playerXP;
        friends = plr.friends;
        ignores = plr.ignores;
        playerLook = plr.playerLook;
        pHead = plr.pHead;
        pTorso = plr.pTorso;
        pArms = plr.pArms;
        pHands = plr.pHands;
        pLegs = plr.pLegs;
        pFeet = plr.pFeet;
        pBeard = plr.pBeard;
        clueRewardDelay = plr.clueRewardDelay;
        FightArenaKills = plr.FightArenaKills;
        mageArenaKills = plr.mageArenaKills;
        dharokSummoned = plr.dharokSummoned;
        ahrimSummoned = plr.ahrimSummoned;
        guthanSummoned = plr.guthanSummoned;
        karilSummoned = plr.karilSummoned;
        toragSummoned = plr.toragSummoned;
        veracSummoned = plr.veracSummoned;
        hiddenBarrowBro = plr.hiddenBarrowBro;
        poisonDelay = plr.poisonDelay;
        specialAmount = plr.specialAmount;
        spellSet = plr.spellSet;
        vengenceDelay = plr.vengenceDelay;
        muted = plr.muted;
        pcPoints = plr.pcPoints;
        pkPoints = plr.pkPoints;
		zombiePoints = plr.zombiePoints;
		clanWarsPoints = plr.clanWarsPoints;
        skullTimer = plr.skullTimer;
        tzWave = plr.tzWave;
        crystalBowShots = plr.crystalBowShots;
        ancQuest = plr.ancQuest;
        legendQuest = plr.legendQuest;
        mageZQuest = plr.mageZQuest;
        slayerId = plr.slayerId;
        slayerAmt = plr.slayerAmt;
        runeMysteriesQuest = plr.runeMysteriesQuest;
        mageArenaQuest = plr.mageArenaQuest;
        lunarQuest = plr.lunarQuest;
        knightWavesQuest = plr.knightWavesQuest;
        skillId = plr.skillId;
        lostCityQuest = plr.lostCityQuest;
        forgeRing = plr.forgeRing;
    }
}

package li.cil.oc.common.init

import cpw.mods.fml.common.registry.GameRegistry
import li.cil.oc.Constants
import li.cil.oc.Settings
import li.cil.oc.common.Tier
import li.cil.oc.common.block._
import li.cil.oc.common.recipe.Recipes
import li.cil.oc.common.tileentity

object Blocks {
  def init() {
    GameRegistry.registerTileEntity(classOf[tileentity.AccessPoint], Settings.namespace + "access_point")
    GameRegistry.registerTileEntity(classOf[tileentity.Adapter], Settings.namespace + "adapter")
    GameRegistry.registerTileEntityWithAlternatives(classOf[tileentity.Assembler], Settings.namespace + "assembler", Settings.namespace + "robotAssembler")
    GameRegistry.registerTileEntity(classOf[tileentity.Cable], Settings.namespace + "cable")
    GameRegistry.registerTileEntity(classOf[tileentity.Capacitor], Settings.namespace + "capacitor")
    GameRegistry.registerTileEntity(classOf[tileentity.CarpetedCapacitor], Settings.namespace + "carpetedCapacitor")
    GameRegistry.registerTileEntity(classOf[tileentity.Case], Settings.namespace + "case")
    GameRegistry.registerTileEntity(classOf[tileentity.Charger], Settings.namespace + "charger")
    GameRegistry.registerTileEntity(classOf[tileentity.DiskDrive], Settings.namespace + "disk_drive")
    GameRegistry.registerTileEntity(classOf[tileentity.Disassembler], Settings.namespace + "disassembler")
    GameRegistry.registerTileEntity(classOf[tileentity.Keyboard], Settings.namespace + "keyboard")
    GameRegistry.registerTileEntity(classOf[tileentity.Hologram], Settings.namespace + "hologram")
    GameRegistry.registerTileEntity(classOf[tileentity.Geolyzer], Settings.namespace + "geolyzer")
    GameRegistry.registerTileEntity(classOf[tileentity.Microcontroller], Settings.namespace + "microcontroller")
    GameRegistry.registerTileEntity(classOf[tileentity.MotionSensor], Settings.namespace + "motion_sensor")
    GameRegistry.registerTileEntity(classOf[tileentity.NetSplitter], Settings.namespace + "netSplitter")
    GameRegistry.registerTileEntity(classOf[tileentity.PowerConverter], Settings.namespace + "power_converter")
    GameRegistry.registerTileEntity(classOf[tileentity.PowerDistributor], Settings.namespace + "power_distributor")
    GameRegistry.registerTileEntity(classOf[tileentity.Print], Settings.namespace + "print")
    GameRegistry.registerTileEntity(classOf[tileentity.Printer], Settings.namespace + "printer")
    GameRegistry.registerTileEntity(classOf[tileentity.Raid], Settings.namespace + "raid")
    GameRegistry.registerTileEntity(classOf[tileentity.Redstone], Settings.namespace + "redstone")
    GameRegistry.registerTileEntity(classOf[tileentity.Relay], Settings.namespace + "relay")
    GameRegistry.registerTileEntity(classOf[tileentity.RobotProxy], Settings.namespace + "robot")
    GameRegistry.registerTileEntity(classOf[tileentity.Switch], Settings.namespace + "switch")
    GameRegistry.registerTileEntity(classOf[tileentity.Screen], Settings.namespace + "screen")
    GameRegistry.registerTileEntityWithAlternatives(classOf[tileentity.Rack], Settings.namespace + "rack", Settings.namespace + "serverRack")
    GameRegistry.registerTileEntity(classOf[tileentity.Transposer], Settings.namespace + "transposer")
    GameRegistry.registerTileEntity(classOf[tileentity.Waypoint], Settings.namespace + "waypoint")

    Items.registerBlock(new AccessPoint(), Constants.BlockName.AccessPoint)
    Recipes.addBlock(new Adapter(), Constants.BlockName.Adapter, "oc:adapter")
    Recipes.addBlock(new Assembler(), Constants.BlockName.Assembler, "oc:assembler")
    Recipes.addBlock(new Cable(), Constants.BlockName.Cable, "oc:cable")
    Recipes.addBlock(new Capacitor(), Constants.BlockName.Capacitor, "oc:capacitor")
    Recipes.addBlock(new Case(Tier.One), Constants.BlockName.CaseTier1, "oc:case1")
    Recipes.addBlock(new Case(Tier.Three), Constants.BlockName.CaseTier3, "oc:case3")
    Recipes.addBlock(new Case(Tier.Two), Constants.BlockName.CaseTier2, "oc:case2")
    Recipes.addBlock(new Charger(), Constants.BlockName.Charger, "oc:charger")
    Recipes.addBlock(new Disassembler(), Constants.BlockName.Disassembler, "oc:disassembler")
    Recipes.addBlock(new DiskDrive(), Constants.BlockName.DiskDrive, "oc:diskDrive")
    Recipes.addBlock(new Geolyzer(), Constants.BlockName.Geolyzer, "oc:geolyzer")
    Recipes.addBlock(new Hologram(Tier.One), Constants.BlockName.HologramTier1, "oc:hologram1")
    Recipes.addBlock(new Hologram(Tier.Two), Constants.BlockName.HologramTier2, "oc:hologram2")
    Recipes.addBlock(new Keyboard(), Constants.BlockName.Keyboard, "oc:keyboard")
    Recipes.addBlock(new MotionSensor(), Constants.BlockName.MotionSensor, "oc:motionSensor")
    Recipes.addBlock(new PowerConverter(), Constants.BlockName.PowerConverter, "oc:powerConverter")
    Recipes.addBlock(new PowerDistributor(), Constants.BlockName.PowerDistributor, "oc:powerDistributor")
    Recipes.addBlock(new Raid(), Constants.BlockName.Raid, "oc:raid")
    Recipes.addBlock(new Redstone(), Constants.BlockName.Redstone, "oc:redstone")
    Recipes.addBlock(new Relay(), Constants.BlockName.Relay, "oc:relay")
    Recipes.addBlock(new Screen(Tier.One), Constants.BlockName.ScreenTier1, "oc:screen1")
    Recipes.addBlock(new Screen(Tier.Three), Constants.BlockName.ScreenTier3, "oc:screen3")
    Recipes.addBlock(new Screen(Tier.Two), Constants.BlockName.ScreenTier2, "oc:screen2")
    Recipes.addBlock(new Screen(Tier.Four), Constants.BlockName.TileScreen1, "oc:tilescreen1")
    Recipes.addBlock(new Screen(Tier.Five), Constants.BlockName.TileScreen2, "oc:tilescreen2")
    Recipes.addBlock(new Rack(), Constants.BlockName.Rack, "oc:rack", "oc:serverRack")
    Items.registerBlock(new Switch(), Constants.BlockName.Switch)

    Items.registerBlock(new Case(Tier.Four), Constants.BlockName.CaseCreative)
    Items.registerBlock(new Microcontroller(), Constants.BlockName.Microcontroller)
    Items.registerBlock(new RobotAfterimage(), Constants.BlockName.RobotAfterimage)
    Items.registerBlock(new RobotProxy(), Constants.BlockName.Robot)

    // v1.5.4
    Items.registerBlock(new Print(), "print")
    Recipes.addBlock(new Printer(), "printer", "oc:printer")
    Recipes.addBlock(new ChameliumBlock(), "chameliumBlock", "oc:chameliumBlock")
    Recipes.addBlock(new Waypoint(), Constants.BlockName.Waypoint, "oc:waypoint")

    // v1.5.10
    Recipes.addBlock(new FakeEndstone(), Constants.BlockName.Endstone, "oc:stoneEndstone")

    // v1.5.14
    Recipes.addBlock(new NetSplitter(), Constants.BlockName.NetSplitter, "oc:netSplitter")

    // v1.5.16
    Recipes.addBlock(new Transposer(), Constants.BlockName.Transposer, "oc:transposer")

    // v1.7.2
    Recipes.addBlock(new CarpetedCapacitor(), Constants.BlockName.CarpetedCapacitor, "oc:carpetedCapacitor")
  }
}

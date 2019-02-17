package io.kinoplan.scalajs.react.material.ui.core.icons

import io.kinoplan.scalajs.react.material.ui.core._
import japgolly.scalajs.react.component.Js.{RawMounted, UnmountedWithRawType}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent, ReactMouseEventFromHtml}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait SvgIconProps extends js.Object {
  var key: js.UndefOr[String]                        = js.native
  var ref: js.UndefOr[String]                        = js.native
  var color: js.UndefOr[String]                      = js.native
  var hoverColor: js.UndefOr[String]                 = js.native
  var onMouseEnter: OnJSEv1[ReactMouseEventFromHtml] = js.native
  var onMouseLeave: OnJSEv1[ReactMouseEventFromHtml] = js.native
  var style: js.UndefOr[CssProperties]               = js.native
  var viewBox: js.UndefOr[String]                    = js.native
}

object SvgIcon {
  implicit class SvgIconApply(icon: SvgIcon) {
    def apply(
      key: js.UndefOr[String] = js.undefined,
      ref: js.UndefOr[String] = js.undefined,
      color: js.UndefOr[String] = js.undefined,
      hoverColor: js.UndefOr[String] = js.undefined,
      onMouseEnter: ReactHandler1[ReactMouseEventFromHtml] = js.undefined,
      onMouseLeave: ReactHandler1[ReactMouseEventFromHtml] = js.undefined,
      style: js.UndefOr[CssProperties] = js.undefined,
      viewBox: js.UndefOr[String] = js.undefined
    )(children: VdomNode*): UnmountedWithRawType[SvgIconProps, Null, RawMounted[SvgIconProps, Null]] = {
      val p = props(
        key,
        ref,
        color,
        hoverColor,
        onMouseEnter,
        onMouseLeave,
        style,
        viewBox
      )
      val svgProps: SvgIconProps = p.asInstanceOf[SvgIconProps]
      val Component                 = JsComponent[SvgIconProps, Children.Varargs, Null](icon)
      Component(svgProps)(children: _*)
    }

    private def props(
      key: js.UndefOr[String],
      ref: js.UndefOr[String],
      color: js.UndefOr[String],
      hoverColor: js.UndefOr[String],
      onMouseEnter: OnJSEv1[ReactMouseEventFromHtml],
      onMouseLeave: OnJSEv1[ReactMouseEventFromHtml],
      style: js.UndefOr[CssProperties],
      viewBox: js.UndefOr[String]
    ): SvgIconProps = {
      val p = js.Dynamic.literal()
      key.foreach(p.updateDynamic("key")(_))
      ref.foreach(p.updateDynamic("ref")(_))
      color.foreach(p.updateDynamic("color")(_))
      hoverColor.foreach(p.updateDynamic("hoverColor")(_))
      onMouseEnter.foreach(p.updateDynamic("onMouseEnter")(_))
      onMouseLeave.foreach(p.updateDynamic("onMouseLeave")(_))
      style.foreach(p.updateDynamic("style")(_))
      viewBox.foreach(p.updateDynamic("viewBox")(_))
      p.asInstanceOf[SvgIconProps]
    }
  }
}

@js.native
trait SvgIcon extends js.Any

object SvgIcons {
  @js.native @JSImport("@material-ui/icons", "AccessAlarm")
  object AccessAlarmIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AccessAlarms")
  object AccessAlarmsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Accessibility")
  object AccessibilityIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Accessible")
  object AccessibleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AccessTime")
  object AccessTimeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AccountBalance")
  object AccountBalanceIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AccountBalanceWallet")
  object AccountBalanceWalletIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AccountBox")
  object AccountBoxIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AccountCircle")
  object AccountCircleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AcUnit")
  object AcUnitIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Adb")
  object AdbIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Add")
  object AddIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AddAlarm")
  object AddAlarmIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AddAlert")
  object AddAlertIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AddAPhoto")
  object AddAPhotoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AddBox")
  object AddBoxIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AddCircle")
  object AddCircleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AddCircleOutline")
  object AddCircleOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AddLocation")
  object AddLocationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AddShoppingCart")
  object AddShoppingCartIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AddToPhotos")
  object AddToPhotosIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AddToQueue")
  object AddToQueueIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Adjust")
  object AdjustIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AirlineSeatFlat")
  object AirlineSeatFlatIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AirlineSeatFlatAngled")
  object AirlineSeatFlatAngledIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AirlineSeatIndividualSuite")
  object AirlineSeatIndividualSuiteIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AirlineSeatLegroomExtra")
  object AirlineSeatLegroomExtraIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AirlineSeatLegroomNormal")
  object AirlineSeatLegroomNormalIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AirlineSeatLegroomReduced")
  object AirlineSeatLegroomReducedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AirlineSeatReclineExtra")
  object AirlineSeatReclineExtraIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AirlineSeatReclineNormal")
  object AirlineSeatReclineNormalIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AirplanemodeActive")
  object AirplanemodeActiveIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AirplanemodeInactive")
  object AirplanemodeInactiveIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Airplay")
  object AirplayIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AirportShuttle")
  object AirportShuttleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Alarm")
  object AlarmIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AlarmAdd")
  object AlarmAddIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AlarmOff")
  object AlarmOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AlarmOn")
  object AlarmOnIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Album")
  object AlbumIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AllInclusive")
  object AllInclusiveIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AllOut")
  object AllOutIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Android")
  object AndroidIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Announcement")
  object AnnouncementIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Apps")
  object AppsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Archive")
  object ArchiveIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ArrowBack")
  object ArrowBackIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ArrowDownward")
  object ArrowDownwardIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ArrowDropDown")
  object ArrowDropDownIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ArrowDropDownCircle")
  object ArrowDropDownCircleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ArrowDropUp")
  object ArrowDropUpIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ArrowForward")
  object ArrowForwardIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ArrowUpward")
  object ArrowUpwardIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ArtTrack")
  object ArtTrackIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AspectRatio")
  object AspectRatioIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Assessment")
  object AssessmentIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Assignment")
  object AssignmentIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AssignmentInd")
  object AssignmentIndIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AssignmentLate")
  object AssignmentLateIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AssignmentReturn")
  object AssignmentReturnIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AssignmentReturned")
  object AssignmentReturnedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AssignmentTurnedIn")
  object AssignmentTurnedInIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Assistant")
  object AssistantIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AssistantPhoto")
  object AssistantPhotoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AttachFile")
  object AttachFileIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Attachment")
  object AttachmentIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AttachMoney")
  object AttachMoneyIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Audiotrack")
  object AudiotrackIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Autorenew")
  object AutorenewIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "AvTimer")
  object AvTimerIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Backspace")
  object BackspaceIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Backup")
  object BackupIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Battery20")
  object Battery20Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Battery30")
  object Battery30Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Battery50")
  object Battery50Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Battery60")
  object Battery60Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Battery80")
  object Battery80Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Battery90")
  object Battery90Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BatteryAlert")
  object BatteryAlertIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BatteryCharging20")
  object BatteryCharging20Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BatteryCharging30")
  object BatteryCharging30Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BatteryCharging50")
  object BatteryCharging50Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BatteryCharging60")
  object BatteryCharging60Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BatteryCharging80")
  object BatteryCharging80Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BatteryCharging90")
  object BatteryCharging90Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BatteryChargingFull")
  object BatteryChargingFullIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BatteryFull")
  object BatteryFullIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BatteryStd")
  object BatteryStdIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BatteryUnknown")
  object BatteryUnknownIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BeachAccess")
  object BeachAccessIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Beenhere")
  object BeenhereIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Block")
  object BlockIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Bluetooth")
  object BluetoothIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BluetoothAudio")
  object BluetoothAudioIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BluetoothConnected")
  object BluetoothConnectedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BluetoothDisabled")
  object BluetoothDisabledIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BluetoothSearching")
  object BluetoothSearchingIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BlurCircular")
  object BlurCircularIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BlurLinear")
  object BlurLinearIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BlurOff")
  object BlurOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BlurOn")
  object BlurOnIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Book")
  object BookIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Bookmark")
  object BookmarkIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BookmarkBorder")
  object BookmarkBorderIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BorderAll")
  object BorderAllIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BorderBottom")
  object BorderBottomIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BorderClear")
  object BorderClearIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BorderColor")
  object BorderColorIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BorderHorizontal")
  object BorderHorizontalIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BorderInner")
  object BorderInnerIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BorderLeft")
  object BorderLeftIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BorderOuter")
  object BorderOuterIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BorderRight")
  object BorderRightIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BorderStyle")
  object BorderStyleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BorderTop")
  object BorderTopIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BorderVertical")
  object BorderVerticalIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BrandingWatermark")
  object BrandingWatermarkIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Brightness1")
  object Brightness1Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Brightness2")
  object Brightness2Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Brightness3")
  object Brightness3Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Brightness4")
  object Brightness4Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Brightness5")
  object Brightness5Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Brightness6")
  object Brightness6Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Brightness7")
  object Brightness7Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BrightnessAuto")
  object BrightnessAutoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BrightnessHigh")
  object BrightnessHighIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BrightnessLow")
  object BrightnessLowIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BrightnessMedium")
  object BrightnessMediumIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BrokenImage")
  object BrokenImageIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Brush")
  object BrushIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BubbleChart")
  object BubbleChartIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BugReport")
  object BugReportIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Build")
  object BuildIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BurstMode")
  object BurstModeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Business")
  object BusinessIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "BusinessCenter")
  object BusinessCenterIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Cached")
  object CachedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Cake")
  object CakeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Call")
  object CallIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CallEnd")
  object CallEndIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CallMade")
  object CallMadeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CallMerge")
  object CallMergeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CallMissed")
  object CallMissedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CallMissedOutgoing")
  object CallMissedOutgoingIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CallReceived")
  object CallReceivedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CallSplit")
  object CallSplitIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CallToAction")
  object CallToActionIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Camera")
  object CameraIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CameraAlt")
  object CameraAltIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CameraEnhance")
  object CameraEnhanceIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CameraFront")
  object CameraFrontIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CameraRear")
  object CameraRearIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CameraRoll")
  object CameraRollIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Cancel")
  object CancelIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CardGiftcard")
  object CardGiftcardIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CardMembership")
  object CardMembershipIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CardTravel")
  object CardTravelIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Casino")
  object CasinoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Cast")
  object CastIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CastConnected")
  object CastConnectedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CenterFocusStrong")
  object CenterFocusStrongIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CenterFocusWeak")
  object CenterFocusWeakIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ChangeHistory")
  object ChangeHistoryIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Chat")
  object ChatIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ChatBubble")
  object ChatBubbleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ChatBubbleOutline")
  object ChatBubbleOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Check")
  object CheckIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CheckBox")
  object CheckBoxIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CheckBoxOutlineBlank")
  object CheckBoxOutlineBlankIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CheckCircle")
  object CheckCircleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ChevronLeft")
  object ChevronLeftIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ChevronRight")
  object ChevronRightIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ChildCare")
  object ChildCareIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ChildFriendly")
  object ChildFriendlyIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ChromeReaderMode")
  object ChromeReaderModeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Class")
  object ClassIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Clear")
  object ClearIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ClearAll")
  object ClearAllIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Close")
  object CloseIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ClosedCaption")
  object ClosedCaptionIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Cloud")
  object CloudIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CloudCircle")
  object CloudCircleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CloudDone")
  object CloudDoneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CloudDownload")
  object CloudDownloadIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CloudOff")
  object CloudOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CloudQueue")
  object CloudQueueIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CloudUpload")
  object CloudUploadIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Code")
  object CodeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Collections")
  object CollectionsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CollectionsBookmark")
  object CollectionsBookmarkIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Colorize")
  object ColorizeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ColorLens")
  object ColorLensIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Comment")
  object CommentIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Compare")
  object CompareIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CompareArrows")
  object CompareArrowsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Computer")
  object ComputerIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ConfirmationNumber")
  object ConfirmationNumberIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ContactMail")
  object ContactMailIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ContactPhone")
  object ContactPhoneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Contacts")
  object ContactsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ContentCopy")
  object ContentCopyIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ContentCut")
  object ContentCutIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ContentPaste")
  object ContentPasteIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ControlPoint")
  object ControlPointIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ControlPointDuplicate")
  object ControlPointDuplicateIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Copyright")
  object CopyrightIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Create")
  object CreateIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CreateNewFolder")
  object CreateNewFolderIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CreditCard")
  object CreditCardIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Crop")
  object CropIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Crop169")
  object Crop169Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Crop32")
  object Crop32Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Crop54")
  object Crop54Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Crop75")
  object Crop75Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CropDin")
  object CropDinIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CropFree")
  object CropFreeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CropLandscape")
  object CropLandscapeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CropOriginal")
  object CropOriginalIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CropPortrait")
  object CropPortraitIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CropRotate")
  object CropRotateIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "CropSquare")
  object CropSquareIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Dashboard")
  object DashboardIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DataUsage")
  object DataUsageIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DateRange")
  object DateRangeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Dehaze")
  object DehazeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Delete")
  object DeleteIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DeleteForever")
  object DeleteForeverIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DeleteSweep")
  object DeleteSweepIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Description")
  object DescriptionIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DesktopMac")
  object DesktopMacIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DesktopWindows")
  object DesktopWindowsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Details")
  object DetailsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DeveloperBoard")
  object DeveloperBoardIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DeveloperMode")
  object DeveloperModeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DeviceHub")
  object DeviceHubIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Devices")
  object DevicesIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DevicesOther")
  object DevicesOtherIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DialerSip")
  object DialerSipIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Dialpad")
  object DialpadIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Directions")
  object DirectionsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DirectionsBike")
  object DirectionsBikeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DirectionsBoat")
  object DirectionsBoatIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DirectionsBus")
  object DirectionsBusIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DirectionsCar")
  object DirectionsCarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DirectionsRailway")
  object DirectionsRailwayIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DirectionsRun")
  object DirectionsRunIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DirectionsSubway")
  object DirectionsSubwayIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DirectionsTransit")
  object DirectionsTransitIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DirectionsWalk")
  object DirectionsWalkIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DiscFull")
  object DiscFullIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Dns")
  object DnsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Dock")
  object DockIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Domain")
  object DomainIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Done")
  object DoneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DoneAll")
  object DoneAllIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DoNotDisturb")
  object DoNotDisturbIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DoNotDisturbAlt")
  object DoNotDisturbAltIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DoNotDisturbOff")
  object DoNotDisturbOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DoNotDisturbOn")
  object DoNotDisturbOnIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DonutLarge")
  object DonutLargeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DonutSmall")
  object DonutSmallIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Drafts")
  object DraftsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DragHandle")
  object DragHandleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "DriveEta")
  object DriveEtaIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Dvr")
  object DvrIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Edit")
  object EditIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "EditLocation")
  object EditLocationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Eject")
  object EjectIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Email")
  object EmailIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "EnhancedEncryption")
  object EnhancedEncryptionIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Equalizer")
  object EqualizerIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Error")
  object ErrorIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ErrorOutline")
  object ErrorOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "EuroSymbol")
  object EuroSymbolIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Event")
  object EventIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "EventAvailable")
  object EventAvailableIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "EventBusy")
  object EventBusyIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "EventNote")
  object EventNoteIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "EventSeat")
  object EventSeatIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "EvStation")
  object EvStationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ExitToApp")
  object ExitToAppIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ExpandLess")
  object ExpandLessIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ExpandMore")
  object ExpandMoreIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Explicit")
  object ExplicitIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Explore")
  object ExploreIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Exposure")
  object ExposureIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ExposureNeg1")
  object ExposureNeg1Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ExposureNeg2")
  object ExposureNeg2Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ExposurePlus1")
  object ExposurePlus1Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ExposurePlus2")
  object ExposurePlus2Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ExposureZero")
  object ExposureZeroIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Extension")
  object ExtensionIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Face")
  object FaceIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FastForward")
  object FastForwardIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FastRewind")
  object FastRewindIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Favorite")
  object FavoriteIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FavoriteBorder")
  object FavoriteBorderIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FeaturedPlayList")
  object FeaturedPlayListIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FeaturedVideo")
  object FeaturedVideoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Feedback")
  object FeedbackIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FiberDvr")
  object FiberDvrIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FiberManualRecord")
  object FiberManualRecordIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FiberNew")
  object FiberNewIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FiberPin")
  object FiberPinIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FiberSmartRecord")
  object FiberSmartRecordIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FileDownload")
  object FileDownloadIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FileUpload")
  object FileUploadIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Filter")
  object FilterIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Filter1")
  object Filter1Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Filter2")
  object Filter2Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Filter3")
  object Filter3Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Filter4")
  object Filter4Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Filter5")
  object Filter5Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Filter6")
  object Filter6Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Filter7")
  object Filter7Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Filter8")
  object Filter8Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Filter9")
  object Filter9Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Filter9Plus")
  object Filter9PlusIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FilterBAndW")
  object FilterBAndWIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FilterCenterFocus")
  object FilterCenterFocusIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FilterDrama")
  object FilterDramaIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FilterFrames")
  object FilterFramesIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FilterHdr")
  object FilterHdrIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FilterList")
  object FilterListIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FilterNone")
  object FilterNoneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FilterTiltShift")
  object FilterTiltShiftIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FilterVintage")
  object FilterVintageIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FindInPage")
  object FindInPageIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FindReplace")
  object FindReplaceIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Fingerprint")
  object FingerprintIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FirstPage")
  object FirstPageIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FitnessCenter")
  object FitnessCenterIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Flag")
  object FlagIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Flare")
  object FlareIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FlashAuto")
  object FlashAutoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FlashOff")
  object FlashOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FlashOn")
  object FlashOnIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Flight")
  object FlightIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FlightLand")
  object FlightLandIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FlightTakeoff")
  object FlightTakeoffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Flip")
  object FlipIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FlipToBack")
  object FlipToBackIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FlipToFront")
  object FlipToFrontIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Folder")
  object FolderIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FolderOpen")
  object FolderOpenIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FolderShared")
  object FolderSharedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FolderSpecial")
  object FolderSpecialIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FontDownload")
  object FontDownloadIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatAlignCenter")
  object FormatAlignCenterIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatAlignJustify")
  object FormatAlignJustifyIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatAlignLeft")
  object FormatAlignLeftIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatAlignRight")
  object FormatAlignRightIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatBold")
  object FormatBoldIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatClear")
  object FormatClearIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatColorFill")
  object FormatColorFillIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatColorReset")
  object FormatColorResetIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatColorText")
  object FormatColorTextIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatIndentDecrease")
  object FormatIndentDecreaseIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatIndentIncrease")
  object FormatIndentIncreaseIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatItalic")
  object FormatItalicIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatLineSpacing")
  object FormatLineSpacingIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatListBulleted")
  object FormatListBulletedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatListNumbered")
  object FormatListNumberedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatPaint")
  object FormatPaintIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatQuote")
  object FormatQuoteIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatShapes")
  object FormatShapesIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatSize")
  object FormatSizeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatStrikethrough")
  object FormatStrikethroughIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatTextdirectionLToR")
  object FormatTextdirectionLToRIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatTextdirectionRToL")
  object FormatTextdirectionRToLIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FormatUnderlined")
  object FormatUnderlinedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Forum")
  object ForumIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Forward")
  object ForwardIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Forward10")
  object Forward10Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Forward30")
  object Forward30Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Forward5")
  object Forward5Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FreeBreakfast")
  object FreeBreakfastIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Fullscreen")
  object FullscreenIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "FullscreenExit")
  object FullscreenExitIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Functions")
  object FunctionsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Gamepad")
  object GamepadIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Games")
  object GamesIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Gavel")
  object GavelIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Gesture")
  object GestureIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "GetApp")
  object GetAppIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Gif")
  object GifIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "GolfCourse")
  object GolfCourseIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "GpsFixed")
  object GpsFixedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "GpsNotFixed")
  object GpsNotFixedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "GpsOff")
  object GpsOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Grade")
  object GradeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Gradient")
  object GradientIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Grain")
  object GrainIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "GraphicEq")
  object GraphicEqIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "GridOff")
  object GridOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "GridOn")
  object GridOnIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Group")
  object GroupIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "GroupAdd")
  object GroupAddIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "GroupWork")
  object GroupWorkIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "GTranslate")
  object GTranslateIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Hd")
  object HdIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "HdrOff")
  object HdrOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "HdrOn")
  object HdrOnIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "HdrStrong")
  object HdrStrongIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "HdrWeak")
  object HdrWeakIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Headset")
  object HeadsetIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "HeadsetMic")
  object HeadsetMicIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Healing")
  object HealingIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Hearing")
  object HearingIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Help")
  object HelpIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "HelpOutline")
  object HelpOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Highlight")
  object HighlightIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "HighlightOff")
  object HighlightOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "HighQuality")
  object HighQualityIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "History")
  object HistoryIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Home")
  object HomeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Hotel")
  object HotelIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "HotTub")
  object HotTubIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "HourglassEmpty")
  object HourglassEmptyIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "HourglassFull")
  object HourglassFullIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Http")
  object HttpIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Https")
  object HttpsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Image")
  object ImageIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ImageAspectRatio")
  object ImageAspectRatioIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ImportantDevices")
  object ImportantDevicesIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ImportContacts")
  object ImportContactsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ImportExport")
  object ImportExportIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Inbox")
  object InboxIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "IndeterminateCheckBox")
  object IndeterminateCheckBoxIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "index")
  object indexIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Info")
  object InfoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "InfoOutline")
  object InfoOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Input")
  object InputIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "InsertChart")
  object InsertChartIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "InsertComment")
  object InsertCommentIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "InsertDriveFile")
  object InsertDriveFileIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "InsertEmoticon")
  object InsertEmoticonIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "InsertInvitation")
  object InsertInvitationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "InsertLink")
  object InsertLinkIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "InsertPhoto")
  object InsertPhotoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "InvertColors")
  object InvertColorsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "InvertColorsOff")
  object InvertColorsOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Iso")
  object IsoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Keyboard")
  object KeyboardIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "KeyboardArrowDown")
  object KeyboardArrowDownIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "KeyboardArrowLeft")
  object KeyboardArrowLeftIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "KeyboardArrowRight")
  object KeyboardArrowRightIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "KeyboardArrowUp")
  object KeyboardArrowUpIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "KeyboardBackspace")
  object KeyboardBackspaceIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "KeyboardCapslock")
  object KeyboardCapslockIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "KeyboardHide")
  object KeyboardHideIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "KeyboardReturn")
  object KeyboardReturnIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "KeyboardTab")
  object KeyboardTabIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "KeyboardVoice")
  object KeyboardVoiceIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Kitchen")
  object KitchenIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Label")
  object LabelIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LabelOutline")
  object LabelOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Landscape")
  object LandscapeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Language")
  object LanguageIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Laptop")
  object LaptopIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LaptopChromebook")
  object LaptopChromebookIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LaptopMac")
  object LaptopMacIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LaptopWindows")
  object LaptopWindowsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LastPage")
  object LastPageIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Launch")
  object LaunchIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Layers")
  object LayersIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LayersClear")
  object LayersClearIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LeakAdd")
  object LeakAddIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LeakRemove")
  object LeakRemoveIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Lens")
  object LensIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LibraryAdd")
  object LibraryAddIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LibraryBooks")
  object LibraryBooksIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LibraryMusic")
  object LibraryMusicIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LightbulbOutline")
  object LightbulbOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LinearScale")
  object LinearScaleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LineStyle")
  object LineStyleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LineWeight")
  object LineWeightIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Link")
  object LinkIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LinkedCamera")
  object LinkedCameraIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "List")
  object ListIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LiveHelp")
  object LiveHelpIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LiveTv")
  object LiveTvIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalActivity")
  object LocalActivityIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalAirport")
  object LocalAirportIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalAtm")
  object LocalAtmIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalBar")
  object LocalBarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalCafe")
  object LocalCafeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalCarWash")
  object LocalCarWashIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalConvenienceStore")
  object LocalConvenienceStoreIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalDining")
  object LocalDiningIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalDrink")
  object LocalDrinkIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalFlorist")
  object LocalFloristIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalGasStation")
  object LocalGasStationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalGroceryStore")
  object LocalGroceryStoreIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalHospital")
  object LocalHospitalIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalHotel")
  object LocalHotelIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalLaundryService")
  object LocalLaundryServiceIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalLibrary")
  object LocalLibraryIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalMall")
  object LocalMallIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalMovies")
  object LocalMoviesIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalOffer")
  object LocalOfferIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalParking")
  object LocalParkingIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalPharmacy")
  object LocalPharmacyIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalPhone")
  object LocalPhoneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalPizza")
  object LocalPizzaIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalPlay")
  object LocalPlayIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalPostOffice")
  object LocalPostOfficeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalPrintshop")
  object LocalPrintshopIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalSee")
  object LocalSeeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalShipping")
  object LocalShippingIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocalTaxi")
  object LocalTaxiIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocationCity")
  object LocationCityIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocationDisabled")
  object LocationDisabledIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocationOff")
  object LocationOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocationOn")
  object LocationOnIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LocationSearching")
  object LocationSearchingIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Lock")
  object LockIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LockOpen")
  object LockOpenIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LockOutline")
  object LockOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Looks")
  object LooksIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Looks3")
  object Looks3Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Looks4")
  object Looks4Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Looks5")
  object Looks5Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Looks6")
  object Looks6Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LooksOne")
  object LooksOneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LooksTwo")
  object LooksTwoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Loop")
  object LoopIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Loupe")
  object LoupeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "LowPriority")
  object LowPriorityIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Loyalty")
  object LoyaltyIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Mail")
  object MailIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MailOutline")
  object MailOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Map")
  object MapIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Markunread")
  object MarkunreadIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MarkunreadMailbox")
  object MarkunreadMailboxIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Memory")
  object MemoryIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Menu")
  object MenuIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MergeType")
  object MergeTypeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Message")
  object MessageIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Mic")
  object MicIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MicNone")
  object MicNoneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MicOff")
  object MicOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Mms")
  object MmsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ModeComment")
  object ModeCommentIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ModeEdit")
  object ModeEditIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MonetizationOn")
  object MonetizationOnIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MoneyOff")
  object MoneyOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MonochromePhotos")
  object MonochromePhotosIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Mood")
  object MoodIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MoodBad")
  object MoodBadIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "More")
  object MoreIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MoreHoriz")
  object MoreHorizIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MoreVert")
  object MoreVertIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Motorcycle")
  object MotorcycleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Mouse")
  object MouseIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MoveToInbox")
  object MoveToInboxIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Movie")
  object MovieIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MovieCreation")
  object MovieCreationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MovieFilter")
  object MovieFilterIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MultilineChart")
  object MultilineChartIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MusicNote")
  object MusicNoteIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MusicVideo")
  object MusicVideoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "MyLocation")
  object MyLocationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Nature")
  object NatureIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NaturePeople")
  object NaturePeopleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NavigateBefore")
  object NavigateBeforeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NavigateNext")
  object NavigateNextIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Navigation")
  object NavigationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NearMe")
  object NearMeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NetworkCell")
  object NetworkCellIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NetworkCheck")
  object NetworkCheckIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NetworkLocked")
  object NetworkLockedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NetworkWifi")
  object NetworkWifiIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NewReleases")
  object NewReleasesIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NextWeek")
  object NextWeekIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Nfc")
  object NfcIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NoEncryption")
  object NoEncryptionIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NoSim")
  object NoSimIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Note")
  object NoteIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NoteAdd")
  object NoteAddIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Notifications")
  object NotificationsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NotificationsActive")
  object NotificationsActiveIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NotificationsNone")
  object NotificationsNoneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NotificationsOff")
  object NotificationsOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NotificationsPaused")
  object NotificationsPausedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "NotInterested")
  object NotInterestedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "OfflinePin")
  object OfflinePinIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "OndemandVideo")
  object OndemandVideoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Opacity")
  object OpacityIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "OpenInBrowser")
  object OpenInBrowserIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "OpenInNew")
  object OpenInNewIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "OpenWith")
  object OpenWithIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Pages")
  object PagesIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Pageview")
  object PageviewIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Palette")
  object PaletteIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Panorama")
  object PanoramaIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PanoramaFishEye")
  object PanoramaFishEyeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PanoramaHorizontal")
  object PanoramaHorizontalIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PanoramaVertical")
  object PanoramaVerticalIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PanoramaWideAngle")
  object PanoramaWideAngleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PanTool")
  object PanToolIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PartyMode")
  object PartyModeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Pause")
  object PauseIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PauseCircleFilled")
  object PauseCircleFilledIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PauseCircleOutline")
  object PauseCircleOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Payment")
  object PaymentIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "People")
  object PeopleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PeopleOutline")
  object PeopleOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PermCameraMic")
  object PermCameraMicIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PermContactCalendar")
  object PermContactCalendarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PermDataSetting")
  object PermDataSettingIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PermDeviceInformation")
  object PermDeviceInformationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PermIdentity")
  object PermIdentityIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PermMedia")
  object PermMediaIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PermPhoneMsg")
  object PermPhoneMsgIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PermScanWifi")
  object PermScanWifiIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Person")
  object PersonIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PersonAdd")
  object PersonAddIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PersonalVideo")
  object PersonalVideoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PersonOutline")
  object PersonOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PersonPin")
  object PersonPinIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PersonPinCircle")
  object PersonPinCircleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Pets")
  object PetsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Phone")
  object PhoneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhoneAndroid")
  object PhoneAndroidIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhoneBluetoothSpeaker")
  object PhoneBluetoothSpeakerIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhoneForwarded")
  object PhoneForwardedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhoneInTalk")
  object PhoneInTalkIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhoneIphone")
  object PhoneIphoneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Phonelink")
  object PhonelinkIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhonelinkErase")
  object PhonelinkEraseIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhonelinkLock")
  object PhonelinkLockIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhonelinkOff")
  object PhonelinkOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhonelinkRing")
  object PhonelinkRingIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhonelinkSetup")
  object PhonelinkSetupIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhoneLocked")
  object PhoneLockedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhoneMissed")
  object PhoneMissedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhonePaused")
  object PhonePausedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Photo")
  object PhotoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhotoAlbum")
  object PhotoAlbumIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhotoCamera")
  object PhotoCameraIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhotoFilter")
  object PhotoFilterIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhotoLibrary")
  object PhotoLibraryIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhotoSizeSelectActual")
  object PhotoSizeSelectActualIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhotoSizeSelectLarge")
  object PhotoSizeSelectLargeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PhotoSizeSelectSmall")
  object PhotoSizeSelectSmallIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PictureAsPdf")
  object PictureAsPdfIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PictureInPicture")
  object PictureInPictureIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PictureInPictureAlt")
  object PictureInPictureAltIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PieChart")
  object PieChartIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PieChartOutlined")
  object PieChartOutlinedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PinDrop")
  object PinDropIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Place")
  object PlaceIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PlayArrow")
  object PlayArrowIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PlayCircleFilled")
  object PlayCircleFilledIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PlayCircleOutline")
  object PlayCircleOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PlayForWork")
  object PlayForWorkIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PlaylistAdd")
  object PlaylistAddIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PlaylistAddCheck")
  object PlaylistAddCheckIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PlaylistPlay")
  object PlaylistPlayIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PlusOne")
  object PlusOneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Poll")
  object PollIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Polymer")
  object PolymerIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Pool")
  object PoolIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PortableWifiOff")
  object PortableWifiOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Portrait")
  object PortraitIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Power")
  object PowerIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PowerInput")
  object PowerInputIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PowerSettingsNew")
  object PowerSettingsNewIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PregnantWoman")
  object PregnantWomanIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PresentToAll")
  object PresentToAllIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Print")
  object PrintIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "PriorityHigh")
  object PriorityHighIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Public")
  object PublicIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Publish")
  object PublishIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "QueryBuilder")
  object QueryBuilderIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "QuestionAnswer")
  object QuestionAnswerIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Queue")
  object QueueIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "QueueMusic")
  object QueueMusicIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "QueuePlayNext")
  object QueuePlayNextIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Radio")
  object RadioIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RadioButtonChecked")
  object RadioButtonCheckedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RadioButtonUnchecked")
  object RadioButtonUncheckedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RateReview")
  object RateReviewIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Receipt")
  object ReceiptIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RecentActors")
  object RecentActorsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RecordVoiceOver")
  object RecordVoiceOverIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Redeem")
  object RedeemIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Redo")
  object RedoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Refresh")
  object RefreshIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Remove")
  object RemoveIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RemoveCircle")
  object RemoveCircleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RemoveCircleOutline")
  object RemoveCircleOutlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RemoveFromQueue")
  object RemoveFromQueueIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RemoveRedEye")
  object RemoveRedEyeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RemoveShoppingCart")
  object RemoveShoppingCartIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Reorder")
  object ReorderIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Repeat")
  object RepeatIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RepeatOne")
  object RepeatOneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Replay")
  object ReplayIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Replay10")
  object Replay10Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Replay30")
  object Replay30Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Replay5")
  object Replay5Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Reply")
  object ReplyIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ReplyAll")
  object ReplyAllIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Report")
  object ReportIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ReportProblem")
  object ReportProblemIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Restaurant")
  object RestaurantIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RestaurantMenu")
  object RestaurantMenuIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Restore")
  object RestoreIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RestorePage")
  object RestorePageIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RingVolume")
  object RingVolumeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Room")
  object RoomIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RoomService")
  object RoomServiceIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Rotate90DegreesCcw")
  object Rotate90DegreesCcwIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RotateLeft")
  object RotateLeftIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RotateRight")
  object RotateRightIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RoundedCorner")
  object RoundedCornerIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Router")
  object RouterIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Rowing")
  object RowingIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RssFeed")
  object RssFeedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "RvHookup")
  object RvHookupIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Satellite")
  object SatelliteIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Save")
  object SaveIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Scanner")
  object ScannerIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Schedule")
  object ScheduleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "School")
  object SchoolIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ScreenLockLandscape")
  object ScreenLockLandscapeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ScreenLockPortrait")
  object ScreenLockPortraitIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ScreenLockRotation")
  object ScreenLockRotationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ScreenRotation")
  object ScreenRotationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ScreenShare")
  object ScreenShareIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SdCard")
  object SdCardIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SdStorage")
  object SdStorageIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Search")
  object SearchIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Security")
  object SecurityIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SelectAll")
  object SelectAllIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Send")
  object SendIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SentimentDissatisfied")
  object SentimentDissatisfiedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SentimentNeutral")
  object SentimentNeutralIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SentimentSatisfied")
  object SentimentSatisfiedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SentimentVeryDissatisfied")
  object SentimentVeryDissatisfiedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SentimentVerySatisfied")
  object SentimentVerySatisfiedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Settings")
  object SettingsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsApplications")
  object SettingsApplicationsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsBackupRestore")
  object SettingsBackupRestoreIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsBluetooth")
  object SettingsBluetoothIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsBrightness")
  object SettingsBrightnessIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsCell")
  object SettingsCellIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsEthernet")
  object SettingsEthernetIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsInputAntenna")
  object SettingsInputAntennaIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsInputComponent")
  object SettingsInputComponentIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsInputComposite")
  object SettingsInputCompositeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsInputHdmi")
  object SettingsInputHdmiIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsInputSvideo")
  object SettingsInputSvideoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsOverscan")
  object SettingsOverscanIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsPhone")
  object SettingsPhoneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsPower")
  object SettingsPowerIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsRemote")
  object SettingsRemoteIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsSystemDaydream")
  object SettingsSystemDaydreamIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SettingsVoice")
  object SettingsVoiceIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Share")
  object ShareIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Shop")
  object ShopIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ShoppingBasket")
  object ShoppingBasketIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ShoppingCart")
  object ShoppingCartIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ShopTwo")
  object ShopTwoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ShortText")
  object ShortTextIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ShowChart")
  object ShowChartIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Shuffle")
  object ShuffleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalCellular0Bar")
  object SignalCellular0BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalCellular1Bar")
  object SignalCellular1BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalCellular2Bar")
  object SignalCellular2BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalCellular3Bar")
  object SignalCellular3BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalCellular4Bar")
  object SignalCellular4BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalCellularConnectedNoInternet0Bar")
  object SignalCellularConnectedNoInternet0BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalCellularConnectedNoInternet1Bar")
  object SignalCellularConnectedNoInternet1BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalCellularConnectedNoInternet2Bar")
  object SignalCellularConnectedNoInternet2BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalCellularConnectedNoInternet3Bar")
  object SignalCellularConnectedNoInternet3BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalCellularConnectedNoInternet4Bar")
  object SignalCellularConnectedNoInternet4BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalCellularNoSim")
  object SignalCellularNoSimIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalCellularNull")
  object SignalCellularNullIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalCellularOff")
  object SignalCellularOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalWifi0Bar")
  object SignalWifi0BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalWifi1Bar")
  object SignalWifi1BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalWifi1BarLock")
  object SignalWifi1BarLockIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalWifi2Bar")
  object SignalWifi2BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalWifi2BarLock")
  object SignalWifi2BarLockIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalWifi3Bar")
  object SignalWifi3BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalWifi3BarLock")
  object SignalWifi3BarLockIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalWifi4Bar")
  object SignalWifi4BarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalWifi4BarLock")
  object SignalWifi4BarLockIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SignalWifiOff")
  object SignalWifiOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SimCard")
  object SimCardIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SimCardAlert")
  object SimCardAlertIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SkipNext")
  object SkipNextIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SkipPrevious")
  object SkipPreviousIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Slideshow")
  object SlideshowIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SlowMotionVideo")
  object SlowMotionVideoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Smartphone")
  object SmartphoneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SmokeFree")
  object SmokeFreeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SmokingRooms")
  object SmokingRoomsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Sms")
  object SmsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SmsFailed")
  object SmsFailedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Snooze")
  object SnoozeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Sort")
  object SortIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SortByAlpha")
  object SortByAlphaIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Spa")
  object SpaIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SpaceBar")
  object SpaceBarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Speaker")
  object SpeakerIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SpeakerGroup")
  object SpeakerGroupIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SpeakerNotes")
  object SpeakerNotesIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SpeakerNotesOff")
  object SpeakerNotesOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SpeakerPhone")
  object SpeakerPhoneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Spellcheck")
  object SpellcheckIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Star")
  object StarIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "StarBorder")
  object StarBorderIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "StarHalf")
  object StarHalfIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Stars")
  object StarsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "StayCurrentLandscape")
  object StayCurrentLandscapeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "StayCurrentPortrait")
  object StayCurrentPortraitIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "StayPrimaryLandscape")
  object StayPrimaryLandscapeIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "StayPrimaryPortrait")
  object StayPrimaryPortraitIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Stop")
  object StopIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "StopScreenShare")
  object StopScreenShareIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Storage")
  object StorageIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Store")
  object StoreIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "StoreMallDirectory")
  object StoreMallDirectoryIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Straighten")
  object StraightenIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Streetview")
  object StreetviewIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "StrikethroughS")
  object StrikethroughSIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Style")
  object StyleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SubdirectoryArrowLeft")
  object SubdirectoryArrowLeftIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SubdirectoryArrowRight")
  object SubdirectoryArrowRightIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Subject")
  object SubjectIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Subscriptions")
  object SubscriptionsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Subtitles")
  object SubtitlesIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Subway")
  object SubwayIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SupervisorAccount")
  object SupervisorAccountIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SurroundSound")
  object SurroundSoundIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SwapCalls")
  object SwapCallsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SwapHoriz")
  object SwapHorizIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SwapVert")
  object SwapVertIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SwapVerticalCircle")
  object SwapVerticalCircleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SwitchCamera")
  object SwitchCameraIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SwitchVideo")
  object SwitchVideoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Sync")
  object SyncIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SyncDisabled")
  object SyncDisabledIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SyncProblem")
  object SyncProblemIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SystemUpdate")
  object SystemUpdateIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "SystemUpdateAlt")
  object SystemUpdateAltIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Tab")
  object TabIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Tablet")
  object TabletIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TabletAndroid")
  object TabletAndroidIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TabletMac")
  object TabletMacIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TabUnselected")
  object TabUnselectedIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TagFaces")
  object TagFacesIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TapAndPlay")
  object TapAndPlayIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Terrain")
  object TerrainIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TextFields")
  object TextFieldsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TextFormat")
  object TextFormatIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Textsms")
  object TextsmsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Texture")
  object TextureIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Theaters")
  object TheatersIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ThreeDRotation")
  object ThreeDRotationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ThumbDown")
  object ThumbDownIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ThumbsUpDown")
  object ThumbsUpDownIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ThumbUp")
  object ThumbUpIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Timelapse")
  object TimelapseIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Timeline")
  object TimelineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Timer")
  object TimerIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Timer10")
  object Timer10Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Timer3")
  object Timer3Icon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TimerOff")
  object TimerOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TimeToLeave")
  object TimeToLeaveIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Title")
  object TitleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Toc")
  object TocIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Today")
  object TodayIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Toll")
  object TollIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Tonality")
  object TonalityIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TouchApp")
  object TouchAppIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Toys")
  object ToysIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TrackChanges")
  object TrackChangesIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Traffic")
  object TrafficIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Train")
  object TrainIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Tram")
  object TramIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TransferWithinAStation")
  object TransferWithinAStationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Transform")
  object TransformIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Translate")
  object TranslateIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TrendingDown")
  object TrendingDownIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TrendingFlat")
  object TrendingFlatIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TrendingUp")
  object TrendingUpIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Tune")
  object TuneIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TurnedIn")
  object TurnedInIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "TurnedInNot")
  object TurnedInNotIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Tv")
  object TvIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Unarchive")
  object UnarchiveIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Undo")
  object UndoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "UnfoldLess")
  object UnfoldLessIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "UnfoldMore")
  object UnfoldMoreIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Update")
  object UpdateIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Usb")
  object UsbIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VerifiedUser")
  object VerifiedUserIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VerticalAlignBottom")
  object VerticalAlignBottomIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VerticalAlignCenter")
  object VerticalAlignCenterIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VerticalAlignTop")
  object VerticalAlignTopIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Vibration")
  object VibrationIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VideoCall")
  object VideoCallIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Videocam")
  object VideocamIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VideocamOff")
  object VideocamOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VideogameAsset")
  object VideogameAssetIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VideoLabel")
  object VideoLabelIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VideoLibrary")
  object VideoLibraryIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ViewAgenda")
  object ViewAgendaIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ViewArray")
  object ViewArrayIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ViewCarousel")
  object ViewCarouselIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ViewColumn")
  object ViewColumnIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ViewComfy")
  object ViewComfyIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ViewCompact")
  object ViewCompactIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ViewDay")
  object ViewDayIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ViewHeadline")
  object ViewHeadlineIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ViewList")
  object ViewListIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ViewModule")
  object ViewModuleIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ViewQuilt")
  object ViewQuiltIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ViewStream")
  object ViewStreamIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ViewWeek")
  object ViewWeekIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Vignette")
  object VignetteIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Visibility")
  object VisibilityIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VisibilityOff")
  object VisibilityOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VoiceChat")
  object VoiceChatIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Voicemail")
  object VoicemailIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VolumeDown")
  object VolumeDownIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VolumeMute")
  object VolumeMuteIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VolumeOff")
  object VolumeOffIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VolumeUp")
  object VolumeUpIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VpnKey")
  object VpnKeyIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "VpnLock")
  object VpnLockIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Wallpaper")
  object WallpaperIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Warning")
  object WarningIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Watch")
  object WatchIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "WatchLater")
  object WatchLaterIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "WbAuto")
  object WbAutoIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "WbCloudy")
  object WbCloudyIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "WbIncandescent")
  object WbIncandescentIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "WbIridescent")
  object WbIridescentIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "WbSunny")
  object WbSunnyIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Wc")
  object WcIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Web")
  object WebIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "WebAsset")
  object WebAssetIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Weekend")
  object WeekendIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Whatshot")
  object WhatshotIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Widgets")
  object WidgetsIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Wifi")
  object WifiIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "WifiLock")
  object WifiLockIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "WifiTethering")
  object WifiTetheringIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "Work")
  object WorkIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "WrapText")
  object WrapTextIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "YoutubeSearchedFor")
  object YoutubeSearchedForIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ZoomIn")
  object ZoomInIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ZoomOut")
  object ZoomOutIcon extends SvgIcon
  @js.native @JSImport("@material-ui/icons", "ZoomOutMap")
  object ZoomOutMapIcon extends SvgIcon
}

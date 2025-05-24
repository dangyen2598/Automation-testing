import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ebank.tpb.vn/retail/vX/')

WebUI.doubleClick(findTestObject('Object Repository/Page_Ngn hng S C nhn TPBank/input_TPBank xin cho Bn,_form-control ng-un_2e9c03'))

WebUI.setText(findTestObject('Object Repository/Page_Ngn hng S C nhn TPBank/input_TPBank xin cho Bn,_form-control ng-un_2e9c03'), 
    'eee')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ngn hng S C nhn TPBank/input_Hoc kim tra li thng tin ng nhp c TPBa_538ccc'), 
    'ZxBfMDWPmB4gpzLTTjEAug==')

WebUI.doubleClick(findTestObject('Object Repository/Page_Ngn hng S C nhn TPBank/div_ng nhp tht biTn ng nhp hoc mt khu khng _09086b'))


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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://devportal.dearhealth.com/login')

WebUI.setText(findTestObject('Object Repository/Login DH (desktop)/Page_DEARhealth/input_Sign In_username'), 'elenvolley+m@gmail.com')

WebUI.click(findTestObject('Object Repository/Login DH (desktop)/Page_DEARhealth/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Login DH (desktop)/Page_DEARhealth/input_Sign in with OKTA_j_idt261j_idt29'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login DH (desktop)/Page_DEARhealth/input_Skip MFA_password'), 'DwTTIjmC6TINHlIjJvfyFw==')

WebUI.click(findTestObject('Object Repository/Login DH (desktop)/Page_DEARhealth/input_Skip MFA_skipMFA'))

WebUI.click(findTestObject('Object Repository/Login DH (desktop)/Page_DEARhealth/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login DH (desktop)/Page_Provider site/li_Home'), 0)

WebUI.click(findTestObject('Object Repository/Login DH (desktop)/Page_Provider site/span_Eliena Test'))

WebUI.click(findTestObject('Object Repository/Login DH (desktop)/Page_Provider site/button_Sign Out'))

WebUI.closeBrowser()


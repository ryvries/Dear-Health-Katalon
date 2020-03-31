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

//Mobile.startApplication('kobiton-store:54245', true)
Mobile.startApplication('/Users/robdevries/Downloads/dearhealthDebug-3.7.1-debug-33.apk', true)

Mobile.tap(findTestObject('First android/android.widget.TextView0'), 0)

Mobile.tap(findTestObject('First android/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('First android/android.widget.TextView0 (1)'), 0)

Mobile.tap(findTestObject('First android/android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('First android/android.widget.RadioButton0 - EU'), 0)

Mobile.tap(findTestObject('First android/android.widget.RadioButton0 - US'), 0)

Mobile.tap(findTestObject('First android/android.widget.RadioButton0 - EU'), 0)

Mobile.setText(findTestObject('First android/android.widget.EditText0 - Search provider... (5)'), 'Dev', 0)

Mobile.tap(findTestObject('First android/android.widget.ImageView0 (5)'), 0)

Mobile.setText(findTestObject('First android/android.widget.EditText0 - Search provider... (5)'), 'Lu', 0)

Mobile.tap(findTestObject('First android/android.widget.ImageView0 (6)'), 0)

Mobile.tap(findTestObject('First android/android.widget.ImageView0 (5)'), 0)

Mobile.setText(findTestObject('First android/android.widget.EditText0 - Search provider... (5)'), 'Dev', 0)

Mobile.tap(findTestObject('First android/android.widget.ImageView0 (7)'), 0)

Mobile.setText(findTestObject('First android/android.widget.EditText0 - Email Address (2)'), 'rob.devries@dearhealth.com', 
    0)

Mobile.setText(findTestObject('First android/android.widget.EditText0 - Password (2)'), 'Lekker-01', 0)

Mobile.tap(findTestObject('First android/android.widget.Button0 - LOGIN AS CAREGIVER'), 0)

Mobile.tap(findTestObject('First android/android.widget.Button0 - OK (1)'), 0)

Mobile.tap(findTestObject('First android/android.widget.Button0 - LOGIN AS PATIENT (2)'), 0)

//Mobile.closeApplication()


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

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/android.widget.LinearLayout (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/android.widget.LinearLayout (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/android.widget.RadioButton - 1 minuto (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/android.widget.Button - Aceptar (4)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/android.widget.TextView - 1 minuto (2)'),
	'1 minuto')

Mobile.tap(findTestObject('Application_hec/Security Access/android.widget.LinearLayout (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/android.widget.RadioButton - 10 minutos (2)'),
	0)

Mobile.tap(findTestObject('Application_hec/Security Access/android.widget.Button - Aceptar (4)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/android.widget.TextView - 10 minutos (2)'),
	'10 minutos')

Mobile.tap(findTestObject('Application_hec/Security Access/android.widget.LinearLayout (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/android.widget.RadioButton - 30 minutos (2)'),
	0)

Mobile.tap(findTestObject('Application_hec/Security Access/android.widget.Button - Aceptar (4)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/android.widget.TextView - 30 minutos (2)'),
	'30 minutos')

Mobile.tap(findTestObject('Application_hec/Security Access/android.widget.LinearLayout (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/android.widget.RadioButton - 1 hora (2)'), 0)

Mobile.tap(findTestObject('Application_hec/Security Access/android.widget.Button - Aceptar (4)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/android.widget.TextView - 1 hora (2)'),
	'1 hora')

Mobile.tap(findTestObject('Application_hec/Security Access/android.widget.LinearLayout (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/android.widget.RadioButton - 12 horas (2)'), 0)

Mobile.tap(findTestObject('Application_hec/Security Access/android.widget.Button - Aceptar (4)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/android.widget.TextView - 12 horas (2)'),
	'12 horas')

Mobile.tap(findTestObject('Application_hec/Security Access/android.widget.LinearLayout (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/android.widget.RadioButton - 1 da (2)'), 0)

Mobile.tap(findTestObject('Application_hec/Security Access/android.widget.Button - Aceptar (4)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/android.widget.TextView - 1 da (2)'),
	'1 día')

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/android.widget.TextView - 7 das (1)'),
	'7 días')

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/android.widget.LinearLayout (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/android.widget.RadioButton - 24 horas (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/android.widget.Button - Aceptar (5)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/android.widget.TextView - 24 horas (2)'),
	'24 horas')


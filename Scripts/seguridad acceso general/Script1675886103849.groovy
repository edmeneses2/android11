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

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - General/android.widget.LinearLayout'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - General/android.widget.Button - Registrar'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - General/android.widget.Spinner'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - General/android.widget.TextView - Cul es el nombre de tu primera mascota'), 
    0)

Mobile.setText(findTestObject('Object Repository/Application_hec/Security Access/Security Access - General/android.widget.EditText - Respuesta'), 
    'aut1', 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - General/android.widget.Button - Siguiente'), 
    0)

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - General/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - General/android.widget.TextView - Cul es tu banda de rock favorita'), 
    0)

Mobile.setText(findTestObject('Application_hec/Security Access/Security Access - General/android.widget.EditText - Respuesta'), 
    'aut2', 0)

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - General/android.widget.Button - Siguiente'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - General/android.widget.Spinner (1)'), 
    0)

Mobile.scrollToText('¿Qué marca de auto te gustaría comprar?')

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - General/android.widget.TextView - Qu marca de auto te gustara comprar'), 
    0)

Mobile.setText(findTestObject('Object Repository/Application_hec/Security Access/Security Access - General/android.widget.EditText - Respuesta (1)'), 
    'aut3', 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - General/android.widget.Button - Finalizar'), 
    0)

Mobile.pressBack()

Mobile.pressBack()


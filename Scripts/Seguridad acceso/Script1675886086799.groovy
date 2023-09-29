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

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.LinearLayout'), 
    0)

Mobile.setText(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.EditText - Pin de acceso antiguo'), 
    '0000', 0)

Mobile.setText(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.EditText - Nuevo pin de acceso'), 
    '1234', 0)

Mobile.setText(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.EditText - Confirmar nuevo pin de acceso'), 
    '1234', 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.Button - Editar'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.LinearLayout (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.RadioButton - Pin  Huella dactilar'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.Button - Aceptar'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.LinearLayout (2)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.RadioButton - Inmediatamente'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.Button - Aceptar (1)'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.TextView - Inmediatamente'), 
    'Inmediatamente')

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - Access/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.RadioButton - 10 Segundos'), 
    0)

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - Access/android.widget.Button - Aceptar (1)'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.TextView - 10 Segundos'), 
    '10 Segundos')

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - Access/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.RadioButton - 30 segundos'), 
    0)

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - Access/android.widget.Button - Aceptar (1)'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.TextView - 30 segundos'), 
    '30 segundos')

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - Access/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.RadioButton - 1 minuto'), 
    0)

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - Access/android.widget.Button - Aceptar (1)'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.TextView - 1 minuto'), 
    '1 minuto')

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - Access/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.RadioButton - 5 minutos'), 
    0)

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - Access/android.widget.Button - Aceptar (1)'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.TextView - 5 minutos'), 
    '5 minutos')

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - Access/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.RadioButton - 1 hora'), 
    0)

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - Access/android.widget.Button - Aceptar (1)'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.TextView - 1 hora'), 
    '1 hora')

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - Access/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Application_hec/Security Access/Security Access - Access/android.widget.RadioButton - 10 Segundos'), 
    0)

Mobile.tap(findTestObject('Application_hec/Security Access/Security Access - Access/android.widget.Button - Aceptar (1)'), 
    0)


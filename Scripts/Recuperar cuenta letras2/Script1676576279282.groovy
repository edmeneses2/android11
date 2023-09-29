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

Mobile.tap(findTestObject('Object Repository/Crear usuario_numeros1/android.widget.Button - Recuperar Cuenta'), 0)

Mobile.tap(findTestObject('Object Repository/Crear usuario_numeros1/android.widget.EditText - Apodo'), 0)

Mobile.setText(findTestObject('Object Repository/Crear usuario_numeros1/android.widget.EditText - Apodo (1)'), 'holamundo', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Crear usuario_numeros1/android.widget.Button - Recuperar'), 0)

Mobile.tap(findTestObject('Object Repository/Crear usuario_numeros1/android.widget.RadioGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Crear usuario_numeros1/android.widget.Button - Siguiente'), 0)

Mobile.tap(findTestObject('Crear usuario_numeros1/android.widget.RadioGroup'), 0)

Mobile.tap(findTestObject('Crear usuario_numeros1/android.widget.Button - Siguiente'), 0)

Mobile.tap(findTestObject('Object Repository/Crear usuario_numeros1/android.widget.RadioButton - No eleg esta pregunta'), 
    0)

Mobile.tap(findTestObject('Crear usuario_numeros1/android.widget.Button - Siguiente'), 0)

Mobile.tap(findTestObject('Object Repository/Crear usuario_numeros1/android.widget.RadioGroup (1)'), 0)

Mobile.tap(findTestObject('Crear usuario_numeros1/android.widget.Button - Siguiente'), 0)

Mobile.tap(findTestObject('Crear usuario_numeros1/android.widget.RadioGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Crear usuario_numeros1/android.widget.Button - Finalizar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Crear usuario_numeros1/android.widget.TextView - Recuperar Cuenta'), 
    'Recuperar Cuenta')

Mobile.tap(findTestObject('Object Repository/Crear usuario_numeros1/android.widget.ImageButton'), 0)


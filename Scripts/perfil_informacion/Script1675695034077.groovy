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

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('perfil contacto/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('bntok_perfilcontacto'), 0)

Mobile.tap(findTestObject('Object Repository/perfil contacto/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/perfil contacto/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/perfil contacto/android.widget.TextView - Seleccionar foto'), 0)

Mobile.tap(findTestObject('perfil contacto/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('perfil contacto/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('perfil contacto/android.widget.TextView'), 0)

Mobile.tap(findTestObject('perfil contacto/android.widget.ImageButton (1)'), 0)

Mobile.clearText(findTestObject('perfil contacto/android.widget.EditText - Edwin Meneses'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/perfil contacto/android.widget.EditText'), 'nombre de prueba', 0)

Mobile.tap(findTestObject('Object Repository/perfil contacto/android.widget.Button - Aceptar'), 0)

Mobile.tap(findTestObject('Object Repository/perfil contacto/android.widget.ImageButton (2)'), 0)

Mobile.setText(findTestObject('Object Repository/perfil contacto/android.widget.EditText - edwin_1324'), 'apodo1325', 0)

Mobile.tap(findTestObject('perfil contacto/android.widget.Button - Aceptar'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('perfil contacto/android.widget.ImageButton (1)'), 0)

Mobile.setText(findTestObject('Object Repository/perfil contacto/android.widget.EditText - nombre de prueba'), 'prueba cancelar', 
    0)

Mobile.tap(findTestObject('Object Repository/perfil contacto/android.widget.Button - Cancelar'), 0)

Mobile.tap(findTestObject('perfil contacto/android.widget.ImageButton (2)'), 0)

Mobile.setText(findTestObject('perfil contacto/android.widget.EditText - apodo1325'), 'cancelar56', 0)

'jj'
Mobile.tap(findTestObject('perfil contacto/android.widget.Button - Cancelar'), 0)


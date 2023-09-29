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

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.ImageButton'), 1)

Mobile.tap(findTestObject('Object Repository/Ayuda/androidx.appcompat.widget.LinearLayoutCompat'), 1)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.LinearLayout'), 1)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.ImageButton (1)'), 1)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.LinearLayout (1)'), 1)

Mobile.setText(findTestObject('Object Repository/Ayuda/android.widget.EditText - Mensaje'), 'hola', 1)

Mobile.verifyElementText(findTestObject('Object Repository/Ayuda/android.widget.TextView - Mnimo 20 caracteres'), 'Mínimo 20 caracteres')

Mobile.clearText(findTestObject('Object Repository/Ayuda/android.widget.EditText - hola'), 0)

Mobile.setText(findTestObject('Ayuda/android.widget.EditText - Mensaje'), 'este es un mensaje de prueba de la aplicacion nn chat', 
    0)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.Button - Enviar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Ayuda/android.widget.FrameLayout'), '')

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.TextView - Reportar un problema'), 0)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.TextView - Comentario'), 0)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.Button - OK'), 0)

Mobile.setText(findTestObject('Ayuda/android.widget.EditText - Mensaje'), 'este es un mensaje de prueba', 0)

Mobile.tap(findTestObject('Ayuda/android.widget.Button - Enviar'), 0)

Mobile.verifyElementText(findTestObject('Ayuda/android.widget.FrameLayout'), '')

Mobile.tap(findTestObject('Ayuda/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Ayuda/android.widget.TextView - Reportar un problema'), 0)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.TextView - Sugerencia'), 0)

Mobile.setText(findTestObject('Ayuda/android.widget.EditText - Mensaje'), 'sugerencia de prueba nn chat', 0)

Mobile.tap(findTestObject('Ayuda/android.widget.Button - Enviar'), 0)

Mobile.verifyElementText(findTestObject('Ayuda/android.widget.FrameLayout'), '')

Mobile.tap(findTestObject('Ayuda/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Ayuda/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.LinearLayout (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.Button - Si'), 0)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.Button - OK (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.Button - OK (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.Button - OK (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.Button - OK (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.Button - OK (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.Button - OK (6)'), 0)

Mobile.tap(findTestObject('Ayuda/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Ayuda/androidx.appcompat.widget.LinearLayoutCompat'), 0)

Mobile.tap(findTestObject('Ayuda/android.widget.LinearLayout (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Ayuda/android.widget.Button - No'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/Ayuda/android.widget.LinearLayout (9)'), 0, 10)

Mobile.pressBack()

Mobile.tapAndHold(findTestObject('Object Repository/Ayuda/android.widget.LinearLayout (10)'), 0, 10)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Ayuda/android.widget.ImageButton (1)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)


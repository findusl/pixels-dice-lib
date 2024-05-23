package de.lehrbaum.lib.pixels

import AdvertisementDataRetrievalKeys
import dev.bluefalcon.ApplicationContext
import dev.bluefalcon.BlueFalcon
import dev.bluefalcon.BlueFalconDelegate
import dev.bluefalcon.BluetoothCharacteristic
import dev.bluefalcon.BluetoothCharacteristicDescriptor
import dev.bluefalcon.BluetoothPeripheral

abstract class CommonPixelScanner(applicationContext: ApplicationContext) {

    private val blueFalcon = BlueFalcon(applicationContext, "6e400001-b5a3-f393-e0a9-e50e24dcca9e")
    private val bluetoothDelegate = BluetoothDelegate()

    init {
        blueFalcon.delegates.add(bluetoothDelegate)
    }

    fun scan() {
        blueFalcon.scan()
    }

    private inner class BluetoothDelegate: BlueFalconDelegate {
        override fun didCharacteristcValueChanged(
            bluetoothPeripheral: BluetoothPeripheral,
            bluetoothCharacteristic: BluetoothCharacteristic
        ) {
            TODO("Not yet implemented")
        }

        override fun didConnect(bluetoothPeripheral: BluetoothPeripheral) {
            TODO("Not yet implemented")
        }

        override fun didDisconnect(bluetoothPeripheral: BluetoothPeripheral) {
            TODO("Not yet implemented")
        }

        override fun didDiscoverCharacteristics(bluetoothPeripheral: BluetoothPeripheral) {
            TODO("Not yet implemented")
        }

        override fun didDiscoverDevice(
            bluetoothPeripheral: BluetoothPeripheral,
            advertisementData: Map<AdvertisementDataRetrievalKeys, Any>
        ) {
            TODO("Not yet implemented")
        }

        override fun didDiscoverServices(bluetoothPeripheral: BluetoothPeripheral) {
            TODO("Not yet implemented")
        }

        override fun didReadDescriptor(
            bluetoothPeripheral: BluetoothPeripheral,
            bluetoothCharacteristicDescriptor: BluetoothCharacteristicDescriptor
        ) {
            TODO("Not yet implemented")
        }

        override fun didRssiUpdate(bluetoothPeripheral: BluetoothPeripheral) {
            TODO("Not yet implemented")
        }

        override fun didUpdateMTU(bluetoothPeripheral: BluetoothPeripheral) {
            TODO("Not yet implemented")
        }

        override fun didWriteCharacteristic(
            bluetoothPeripheral: BluetoothPeripheral,
            bluetoothCharacteristic: BluetoothCharacteristic,
            success: Boolean
        ) {
            TODO("Not yet implemented")
        }

        override fun didWriteDescriptor(
            bluetoothPeripheral: BluetoothPeripheral,
            bluetoothCharacteristicDescriptor: BluetoothCharacteristicDescriptor
        ) {
            TODO("Not yet implemented")
        }

    }
}

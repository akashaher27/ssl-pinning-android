/*
 * Copyright 2018 Wultra s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */

package com.wultra.android.sslpinning.util

import com.wultra.android.sslpinning.TestUtils
import org.junit.Assert.*
import org.junit.Test

/**
 * @author Tomas Kypta, tomas.kypta@wultra.com
 */
class CertUtilsTest {

    @Test
    fun testParseCommonName() {
        val cert = TestUtils.getCertificateFromUrl("https://github.com")
        val cn = CertUtils.parseCommonName(cert)
        assertNotNull(cn)
        assertEquals("github.com", cn)
    }
}
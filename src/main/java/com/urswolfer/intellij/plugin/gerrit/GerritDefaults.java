/*
 * Copyright 2026 Urs Wolfer
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
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.urswolfer.intellij.plugin.gerrit;

/**
 * The defaults this build seeds the settings with, in one place so that they are easy to find and change.
 * They only apply where nothing has been stored yet: an edited setting keeps its stored value.
 *
 * @author Urs Wolfer
 */
public final class GerritDefaults {

    /** Prefilled in the account dialog for a new account. */
    public static final String DEFAULT_WEB_URL = "http://gerrit.xxxxxxx";
    public static final String DEFAULT_LOGIN = "xxx";
    public static final String DEFAULT_PASSWORD = "xxx";

    /** Reviewers added by default when pushing to Gerrit, comma separated. */
    public static final String DEFAULT_AUTO_REVIEWERS = "";

    /** Whether a push to Gerrit votes Code-Review+1 by default. */
    public static final boolean DEFAULT_AUTO_VOTE_ON_PUSH = true;

    private GerritDefaults() {
    }
}

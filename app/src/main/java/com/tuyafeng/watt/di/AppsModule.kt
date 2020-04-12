/*
 * Copyright (C) 2020 Tu Yafeng
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.tuyafeng.watt.di

import androidx.lifecycle.ViewModel
import com.tuyafeng.watt.apps.AppsFragment
import com.tuyafeng.watt.apps.AppsViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class AppsModule {

    @ContributesAndroidInjector(modules = [
        ViewModelBuilder::class
        ])
    internal abstract fun appsFragment(): AppsFragment

    @Binds
    @IntoMap
    @ViewModelKey(AppsViewModel::class)
    abstract fun bindViewModel(viewmodel: AppsViewModel): ViewModel
}
/*
 * Copyright 2017-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.relational.core.mapping.event;

/**
 * Gets published after instantiation and setting of all the properties of an entity. This allows to do some
 * postprocessing of entities if the entities are mutable. For immutable entities use {@link AfterLoadCallback}.
 *
 * @author Jens Schauder
 * @deprecated Use {@link AfterConvertEvent} instead.
 */
@Deprecated
public class AfterLoadEvent<E> extends RelationalEventWithEntity<E> {

	private static final long serialVersionUID = 7343072117054666699L;

	/**
	 * @param entity the newly instantiated entity. Must not be {@literal null}.
	 */
	public AfterLoadEvent(E entity) {
		super(entity);
	}
}

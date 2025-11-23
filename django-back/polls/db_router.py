class PollsRouter:
    route_app_labels = {"polls"}

    def db_for_read(self, model, **hints):
        if model._meta.app_label in self.route_app_labels:
            return "planner"
        return None

    def db_for_write(self, model, **hints):
        if model._meta.app_label in self.route_app_labels:
            return "planner"
        return None

    def allow_migrate(self, db, app_label, model_name=None, **hints):
        if app_label in self.route_app_labels:
            return db == "planner"
        return db == "default"

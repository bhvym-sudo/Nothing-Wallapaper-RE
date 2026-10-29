.class public final LU5/e$e$a;
.super Landroid/content/pm/LauncherApps$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU5/e$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/t;

.field final synthetic b:LU5/e;


# direct methods
.method constructor <init>(LH8/t;LU5/e;)V
    .registers 3

    iput-object p1, p0, LU5/e$e$a;->a:LH8/t;

    iput-object p2, p0, LU5/e$e$a;->b:LU5/e;

    invoke-direct {p0}, Landroid/content/pm/LauncherApps$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPackageAdded(Ljava/lang/String;Landroid/os/UserHandle;)V
    .registers 3

    iget-object p1, p0, LU5/e$e$a;->a:LH8/t;

    iget-object p0, p0, LU5/e$e$a;->b:LU5/e;

    invoke-static {p1, p0}, LU5/e$e;->u(LH8/t;LU5/e;)V

    return-void
.end method

.method public onPackageChanged(Ljava/lang/String;Landroid/os/UserHandle;)V
    .registers 3

    const-string p2, "com.nothing.cardservice"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    iget-object p1, p0, LU5/e$e$a;->a:LH8/t;

    iget-object p0, p0, LU5/e$e$a;->b:LU5/e;

    invoke-static {p1, p0}, LU5/e$e;->u(LH8/t;LU5/e;)V

    :cond_f
    return-void
.end method

.method public onPackageRemoved(Ljava/lang/String;Landroid/os/UserHandle;)V
    .registers 3

    iget-object p1, p0, LU5/e$e$a;->a:LH8/t;

    iget-object p0, p0, LU5/e$e$a;->b:LU5/e;

    invoke-static {p1, p0}, LU5/e$e;->u(LH8/t;LU5/e;)V

    return-void
.end method

.method public onPackagesAvailable([Ljava/lang/String;Landroid/os/UserHandle;Z)V
    .registers 4

    iget-object p1, p0, LU5/e$e$a;->a:LH8/t;

    iget-object p0, p0, LU5/e$e$a;->b:LU5/e;

    invoke-static {p1, p0}, LU5/e$e;->u(LH8/t;LU5/e;)V

    return-void
.end method

.method public onPackagesUnavailable([Ljava/lang/String;Landroid/os/UserHandle;Z)V
    .registers 4

    iget-object p1, p0, LU5/e$e$a;->a:LH8/t;

    iget-object p0, p0, LU5/e$e$a;->b:LU5/e;

    invoke-static {p1, p0}, LU5/e$e;->u(LH8/t;LU5/e;)V

    return-void
.end method

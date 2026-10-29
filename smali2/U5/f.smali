.class public final synthetic LU5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Landroid/content/pm/LauncherApps;

.field public final synthetic r:LU5/e$e$a;


# direct methods
.method public synthetic constructor <init>(Landroid/content/pm/LauncherApps;LU5/e$e$a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU5/f;->q:Landroid/content/pm/LauncherApps;

    iput-object p2, p0, LU5/f;->r:LU5/e$e$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, LU5/f;->q:Landroid/content/pm/LauncherApps;

    iget-object p0, p0, LU5/f;->r:LU5/e$e$a;

    invoke-static {v0, p0}, LU5/e$e;->s(Landroid/content/pm/LauncherApps;LU5/e$e$a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

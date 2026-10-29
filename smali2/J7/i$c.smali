.class public final LJ7/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/d0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final b:LU5/a;

.field private final c:LB7/a;

.field private final d:Lh3/c;

.field private final e:LM1/b;

.field private final f:LF8/I;

.field private final g:LS1/a;

.field private final h:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(LU5/a;LB7/a;Lh3/c;LM1/b;LF8/I;LS1/a;Landroid/content/res/Resources;)V
    .registers 9

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shortcutRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentWallpaperInfoFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockViewFactory"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ7/i$c;->b:LU5/a;

    iput-object p2, p0, LJ7/i$c;->c:LB7/a;

    iput-object p3, p0, LJ7/i$c;->d:Lh3/c;

    iput-object p4, p0, LJ7/i$c;->e:LM1/b;

    iput-object p5, p0, LJ7/i$c;->f:LF8/I;

    iput-object p6, p0, LJ7/i$c;->g:LS1/a;

    iput-object p7, p0, LJ7/i$c;->h:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Class;LZ0/a;)Landroidx/lifecycle/a0;
    .registers 13

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "extras"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/d0$a;->h:LZ0/a$b;

    invoke-virtual {p2, p1}, LZ0/a;->a(LZ0/a$b;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2d

    move-object v5, p1

    check-cast v5, Landroid/app/Application;

    new-instance v0, LJ7/i;

    iget-object v1, p0, LJ7/i$c;->b:LU5/a;

    iget-object v2, p0, LJ7/i$c;->c:LB7/a;

    iget-object v3, p0, LJ7/i$c;->d:Lh3/c;

    invoke-static {p2}, Landroidx/lifecycle/U;->a(LZ0/a;)Landroidx/lifecycle/Q;

    move-result-object v4

    iget-object v6, p0, LJ7/i$c;->e:LM1/b;

    iget-object v7, p0, LJ7/i$c;->f:LF8/I;

    iget-object v8, p0, LJ7/i$c;->g:LS1/a;

    iget-object v9, p0, LJ7/i$c;->h:Landroid/content/res/Resources;

    invoke-direct/range {v0 .. v9}, LJ7/i;-><init>(LU5/a;LB7/a;Lh3/c;Landroidx/lifecycle/Q;Landroid/content/Context;LM1/b;LF8/I;LS1/a;Landroid/content/res/Resources;)V

    return-object v0

    :cond_2d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Required value was null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

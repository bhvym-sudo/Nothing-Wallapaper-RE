.class public final synthetic LJ6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroid/content/Context;

.field public final synthetic r:LJ6/h;

.field public final synthetic s:Lg3/A;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;LJ6/h;Lg3/A;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ6/f;->q:Landroid/content/Context;

    iput-object p2, p0, LJ6/f;->r:LJ6/h;

    iput-object p3, p0, LJ6/f;->s:Lg3/A;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, LJ6/f;->q:Landroid/content/Context;

    iget-object v1, p0, LJ6/f;->r:LJ6/h;

    iget-object p0, p0, LJ6/f;->s:Lg3/A;

    invoke-static {v0, v1, p0}, LJ6/h;->s(Landroid/content/Context;LJ6/h;Lg3/A;)V

    return-void
.end method

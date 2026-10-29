.class public final synthetic LJ6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LJ6/l;

.field public final synthetic r:Landroid/content/Context;

.field public final synthetic s:LJ6/l$a;


# direct methods
.method public synthetic constructor <init>(LJ6/l;Landroid/content/Context;LJ6/l$a;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ6/j;->q:LJ6/l;

    iput-object p2, p0, LJ6/j;->r:Landroid/content/Context;

    iput-object p3, p0, LJ6/j;->s:LJ6/l$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, LJ6/j;->q:LJ6/l;

    iget-object v1, p0, LJ6/j;->r:Landroid/content/Context;

    iget-object p0, p0, LJ6/j;->s:LJ6/l$a;

    invoke-static {v0, v1, p0}, LJ6/l;->p(LJ6/l;Landroid/content/Context;LJ6/l$a;)V

    return-void
.end method

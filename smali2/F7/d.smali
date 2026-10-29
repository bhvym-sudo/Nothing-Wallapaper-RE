.class public final synthetic LF7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:LF7/e;

.field public final synthetic r:LF7/f;


# direct methods
.method public synthetic constructor <init>(LF7/e;LF7/f;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF7/d;->q:LF7/e;

    iput-object p2, p0, LF7/d;->r:LF7/f;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, LF7/d;->q:LF7/e;

    iget-object p0, p0, LF7/d;->r:LF7/f;

    invoke-static {v0, p0, p1}, LF7/e;->d(LF7/e;LF7/f;Landroid/view/View;)V

    return-void
.end method

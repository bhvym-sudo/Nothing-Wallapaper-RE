.class public final synthetic LF7/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Le3/z0;

.field public final synthetic r:LF7/k$b;


# direct methods
.method public synthetic constructor <init>(Le3/z0;LF7/k$b;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF7/l;->q:Le3/z0;

    iput-object p2, p0, LF7/l;->r:LF7/k$b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, LF7/l;->q:Le3/z0;

    iget-object p0, p0, LF7/l;->r:LF7/k$b;

    invoke-static {v0, p0, p1}, LF7/k$b;->d(Le3/z0;LF7/k$b;Landroid/view/View;)V

    return-void
.end method

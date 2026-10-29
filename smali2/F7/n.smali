.class public final synthetic LF7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:LF7/p$a;

.field public final synthetic r:Le3/H0;


# direct methods
.method public synthetic constructor <init>(LF7/p$a;Le3/H0;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF7/n;->q:LF7/p$a;

    iput-object p2, p0, LF7/n;->r:Le3/H0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, LF7/n;->q:LF7/p$a;

    iget-object p0, p0, LF7/n;->r:Le3/H0;

    invoke-static {v0, p0, p1}, LF7/p$a;->e(LF7/p$a;Le3/H0;Landroid/view/View;)V

    return-void
.end method

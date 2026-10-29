.class final synthetic Ly7/S$b;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly7/S;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .registers 9

    const-string v5, "reconfigure(ILcom/nothing/cardservice/CardWidgetMetaInfo;)V"

    const/4 v6, 0x0

    const/4 v1, 0x2

    const-class v3, Ly7/S;

    const-string v4, "reconfigure"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final g(ILF5/m;)V
    .registers 4

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    check-cast p0, Ly7/S;

    invoke-static {p0, p1, p2}, Ly7/S;->r0(Ly7/S;ILF5/m;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, LF5/m;

    invoke-virtual {p0, p1, p2}, Ly7/S$b;->g(ILF5/m;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
